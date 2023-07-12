package arbolesBinarios;

/**
 *
 * @author santy
 */ 
public class ArbolBinarioBusqueda {

    Node root;

    private Node addRecursive(Node current, int value) {
        if(current == null) {
            return new Node(value);
        }

        if(value < current.value) {
            current.left = addRecursive(current.left,value);
        }else if(value > current.value) {
            current.right = addRecursive(current.right,value);
        }else {
            // El valor ya existe
            return current;
        }

        return current; // Devuelve la raíz
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private Node deleteRecursive(Node current, int value) {
        if(current == null) {
            return null;
        }

        if(value == current.value) {

            // Cuando el nodo es una hoja
            if(current.left == null && current.right == null) {
                return null;
            }

            // Cuando el Nodo tiene un hijo
            if(current.right == null) {
                return current.left;
            }

            if(current.left == null) {
                return current.right;
            }

            int smalestValue = findSmaletsValue(current.right);
            current.value = smalestValue;
            current.right = deleteRecursive(current.right,
                    smalestValue);
            return current;
        }

        if(value < current.value) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }

        current.right = deleteRecursive(current.right, value);
        return current;
    }

    private int findSmaletsValue(Node root) {
        return root.left == null ? root.value:
                findSmaletsValue(root.left);
    }

    public void delete(int value) {
        root = deleteRecursive(root,value);
    }
    
    public void preOrden(Node nodo) {
        if(nodo != null) {
            System.out.print(nodo.value +" ");
            inOrden(nodo.left);
            inOrden(nodo.right);
        }
    }
    
    public void inOrden(Node nodo) {
        if(nodo != null) {
            inOrden(nodo.left);
            System.out.print(nodo.value +" ");
            inOrden(nodo.right);
        }
    }
    
    public void postOrden(Node nodo) {
        if(nodo != null) {
            inOrden(nodo.left);
            inOrden(nodo.right);
            System.out.print(nodo.value +" ");
        }
    }

}
