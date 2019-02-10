package binode;

import java.util.ArrayList;
/**
 *
 * @author Nelson
 */
public class BiNode {
    
    public BiNode node1, node2;
    public int data;    
    public static boolean verbosidad = true;
    
    private BiNode(int i) {
        this.data = i;
        this.node1 = null;
        this.node2 = null;
    }

    private BiNode() {
        
    }
    
    public static void main(String[] args) {
        
    // Implementar arbol binario
        
        // Se inicializa arbol binario (AB) con un numero en la raiz
        BiNode root = null;
        root = new BiNode(7);
//        raiz = root;
        
        System.out.println("*** AB Agregar\n");
        // Agregar a AB (incluye balanceo)
        binary_add(root, 6);
        binary_add(root, 4);
        binary_add(root, 3);
        binary_add(root, 5);
        binary_add(root, 8);
        binary_add(root, 6);
        binary_add(root, 9);
        binary_add(root, 1);
        binary_add(root, 11);
        binary_add(root, 12);
        binary_add(root, 13);
        
        b_printLevelOrder(root);  
        // Balancear AB
//        System.out.println("\n\n*** AB Balancear\n");
//        root = binary_balance_out(root);
////
        System.out.println("\n\n*** AB Buscar\n");
        // Busqueda en AB
        binary_search(root, 4);
        binary_search(root, 3);
        binary_search(root, 5);
        binary_search(root, 8);
        binary_search(root, 7);
        binary_search(root, 9);
        binary_search(root, 1);
        binary_search(root, 11);
        
        System.out.println("");
        
        System.out.println("\n\n*** AB Eliminar\n");
        // Eliminar de AB        
        root = binary_delete(root, 34);
        root = binary_delete(root, 13);
        root = binary_delete(root, 11);
        root = binary_delete(root, 14);

        b_printLevelOrder(root); 
        
    System.out.println("\nLista doblemente enlazada\n");
    // Convertir a lista doblemente enlazada (LDE)
        root = convertir_a_lde(root);
        
        if(verbosidad) imprime_lde(root);
        
        System.out.println("\n\n*** LDE Agregar\n");
        // Agregar a LDE
        root = lde_add(root, 5);
        if(verbosidad){ imprime_lde(root); System.out.println("");}
        root = lde_add(root, 5);
        if(verbosidad){ imprime_lde(root); System.out.println("");}
        root = lde_add(root, 5);
        if(verbosidad){ imprime_lde(root); System.out.println("");}
        root = lde_add(root, 11);
        if(verbosidad){ imprime_lde(root); System.out.println("");}
        root = lde_add(root, 0);
        if(verbosidad){ imprime_lde(root); System.out.println("");}
        root = lde_add(root, -2);
        if(verbosidad){ imprime_lde(root); System.out.println("");}
        root = lde_add(root, 1);
        if(verbosidad){ imprime_lde(root); System.out.println("");}
        root = lde_add(root, 4);        
        
        if(verbosidad) imprime_lde(root);
        
        System.out.println("\n\n*** LDE Buscar\n");
        // Busqueda en LDE
        lde_search(root, 4);
        lde_search(root, -2);
        lde_search(root, 22);
        
        if(verbosidad) imprime_lde(root);
        
        System.out.println("\n\n*** LDE Eliminar\n");
        // Eliminar de LDE
        root = lde_delete(root, 5);
        if(verbosidad){ imprime_lde(root); System.out.println("");}
        root = lde_delete(root, 5);
        if(verbosidad){ imprime_lde(root); System.out.println("");}
        root = lde_delete(root, 5);
        if(verbosidad){ imprime_lde(root); System.out.println("");}
        root = lde_delete(root, 5);
        if(verbosidad){ imprime_lde(root); System.out.println("");}
        root = lde_delete(root, 5);
        if(verbosidad){ imprime_lde(root); System.out.println("");}
        root = lde_delete(root, -2);
        if(verbosidad){ imprime_lde(root); System.out.println("");}
        root = lde_delete(root, 30);
        if(verbosidad){ imprime_lde(root); System.out.println("");}
        root = lde_delete(root, 1);
        if(verbosidad){ imprime_lde(root); System.out.println("");}
        root = lde_delete(root, 1);
        if(verbosidad){ imprime_lde(root); System.out.println("");}
        root = lde_delete(root, 3);
        if(verbosidad){ imprime_lde(root); System.out.println("");}
        root = lde_delete(root, 4);
        if(verbosidad){ imprime_lde(root); System.out.println("");}
        root = lde_delete(root, 4);
        if(verbosidad){ imprime_lde(root); System.out.println("");}
        root = lde_delete(root, 6);
        if(verbosidad){ imprime_lde(root); System.out.println("");}
        root = lde_delete(root, 7);
        if(verbosidad){ imprime_lde(root); System.out.println("");}
        root = lde_delete(root, 8);
        if(verbosidad){ imprime_lde(root); System.out.println("");}
        root = lde_delete(root, 9);
        if(verbosidad){ imprime_lde(root); System.out.println("");}
        root = lde_delete(root, 11);
        if(verbosidad){ imprime_lde(root); System.out.println("");}
        root = lde_delete(root, 0);
        if(verbosidad){ imprime_lde(root); System.out.println("");}
        root = lde_delete(root, 0);
        if(verbosidad){ imprime_lde(root); System.out.println("");}
        root = lde_delete(root, 0);
        if(verbosidad){ imprime_lde(root); System.out.println("");}
        root = lde_delete(root, 0);
        if(verbosidad){ imprime_lde(root); System.out.println("");}
        root = lde_delete(root, 5);
        if(verbosidad){ imprime_lde(root); System.out.println("");}
        root = lde_delete(root, 0);
        
        
        if(verbosidad) imprime_lde(root);
        
        System.out.println("\nLista doblemente enlazada");
        imprime_lde(root);
        
        
    }

    private static void binary_add(BiNode node, int i) {
        if (node != null) {
            if (i <= node.data) {
                if (node.node1 == null) {
                    BiNode new_node = new BiNode(i);
                    node.node1 = new_node;      
                    System.out.println("Se añade valor " + i + " al arbol.");
                } else{
                    binary_add(node.node1, i);
                }
            } else {
                if (node.node2 == null) {
                    BiNode new_node = new BiNode(i);
                    node.node2 = new_node;
                    System.out.println("Se añade valor " + i + " al arbol.");
                } else{
                    binary_add(node.node2, i);
                }
            }
        } else{
            System.out.println("arbol null");
            System.exit(0);
        }
    }
    
    private static void binary_search(BiNode node, int i) {
        if (b_existe(node, i)) {
            System.out.println("Valor " + i + " existe en arbol.");
        }else{
            System.out.println("Valor " + i + " no existe en arbol.");
        }
    }
    
    private static boolean b_existe(BiNode node, int i) {
        if (i == node.data) {
            return true;
        } else if(i < node.data){
            if (node.node1 == null) {
                return false;
            }
        } else if(i > node.data){
            if (node.node2 == null) {
                return false;
            }
        }   
        return i < node.data ? 
                b_existe(node.node1, i): 
                b_existe(node.node2, i);
    }
        
    private static BiNode binary_delete(BiNode node, int i) {
        if(b_existe(node, i)){
            BiNode raiz = node;    
            b_delete(node, i);
            return raiz;
        } else{
            System.out.println("Valor " + i + " no existe en arbol.");            
        }
        return node;
    }
    
    private static BiNode b_delete(BiNode node, int i) {
        if (node.data == i) {
            if (node.node1 == null && node.node2 == null) { 
                System.out.println("borrar " + node.data);
                node = null;
                return node;
            } else if(node.node1 != null && node.node2 == null){
                System.out.println("Valor " + i + " no hay eliminacion implementada en este caso");
            } else if(node.node1 == null && node.node2 != null){
                System.out.println("Valor " + i + " no hay eliminacion implementada en este caso");
            } else if(node.node1 != null && node.node2 != null){
                System.out.println("Valor " + i + " no hay eliminacion implementada en este caso");
            }
        } else if (i <= node.data) {
            if (node.node1.data == i) {
                if (!b_hasChildren(node.node1)) {
                    node.node1 = null;
                    System.out.println("Valor " + i + " borrado del arbol.");  
                } else{
                    b_delete(node.node2, i);
                }
            } else{
                b_delete(node.node1, i);
            }
        } else if (i > node.data) {
            if (node.node2.data == i) {
                if (!b_hasChildren(node.node2)) {
                    node.node2 = null;
                    System.out.println("Valor " + i + " borrado del arbol.");  
                } else{
                    b_delete(node.node2, i);
                }
            } else{
                b_delete(node.node2, i);
            }
        }        
        return node;
    }
    
    // contiene el ciclo que imprime el arbol por niveles
    static void b_printLevelOrder(BiNode root) {  
        System.out.println("\nArbol");
        int h = b_height(root); 
        int i; 
        for (i=1; i<=h; i++){ 
            b_printGivenLevel(root, i); 
            System.out.println("");
        }
    } 
    
    // calcula altura del arbol
    static int b_height(BiNode root) { 
        if (root == null) 
           return 0; 
        else
        { 
            /* compute  height of each subtree */
            int lheight = b_height(root.node1); 
            int rheight = b_height(root.node2); 
              
            /* use the larger one */
            if (lheight > rheight) 
                return(lheight+1); 
            else return(rheight+1);  
        } 
    } 
  
    // imprime un nivel del arbol
    static void b_printGivenLevel (BiNode root ,int level) { 
        if (root == null) 
            return; 
        if (level == 1) 
            System.out.print(root.data + " "); 
        else if (level > 1) 
        { 
            b_printGivenLevel(root.node1, level-1); 
            b_printGivenLevel(root.node2, level-1); 
        } 
    } 
    
    private static boolean b_hasChildren(BiNode node) {
        if (node.node1 == null && node.node2 == null) {
            return false;
        }
        return true;
    }

    private static BiNode convertir_a_lde(BiNode root) {
        ArrayList<BiNode> temp = new ArrayList<>();
        recorre_ascendente(temp, root);
        for (int i = 0; i < temp.size(); i++) {
            if (i==0) {
                temp.get(i).node1 = null;
            } else{
                temp.get(i).node1 = temp.get(i-1);
            }            
            if (i == temp.size()-1) {
                temp.get(i).node2 = null;
            } else{
                temp.get(i).node2 = temp.get(i+1);
            }            
        }
        root = temp.get(0);
        return root;
    }
    
    private static void recorre_ascendente(ArrayList<BiNode> temp, BiNode node) {
        if (node != null) {
            recorre_ascendente(temp, node.node1);
            temp.add(node);
            recorre_ascendente(temp, node.node2);
        }
    }

    private static BiNode lde_add(BiNode node, int i) {
        BiNode new_node = new BiNode();
        new_node.data = i;
        if (i <= node.data) {
            new_node.node1 = node.node1;
            if (new_node.node1 != null) {
                new_node.node1.node2 = new_node;
            }            
            node.node1 = new_node;
            new_node.node2 = node;
            node = new_node;
            System.out.println("Valor " + i + " agregado a lista.");
            
        } else if(node.node2 != null){
            lde_add(node.node2, i);
        } else{
            node.node2 = new_node;
            new_node.node1 = node;
            new_node.node2 =  null;
            System.out.println("Valor " + i + " agregado a lista.");
        }        
        return node;
    }

    private static void lde_search(BiNode node, int i) {
        if (lde_existe(node, i)) {
            System.out.println("Valor " + i + " existe en lista.");
        }else{
            System.out.println("Valor " + i + " no existe en lista.");
        }
    }
    
    private static boolean lde_existe(BiNode node, int i) {
        if (i == node.data) {
            return true;
        } else if(node.node2 == null) {
            return false;
        }   
        return lde_existe(node.node2, i);
    }
    
    private static BiNode lde_delete(BiNode node, int i) {
        if (node == null) {
            System.out.println("lista vacía.");
        }else if (lde_existe(node, i)) {
            if (node.data == i) {
                if (node.node1 != null && node.node2 != null) {                    
                    node.node1.node2 = node.node2;
                    node.node2.node1 = node.node1;
                    while(node.node1 != null){
                        node = node.node1;
                    }
                } else if(node.node1 != null && node.node2 == null){
                    node.node1.node2 = null;
                    while(node.node1 != null){
                        node = node.node1;
                    }
                } else if(node.node1 == null && node.node2 != null){
                    node.node2.node1 = null;
                    node = node.node2;
                } else{
                    node = null;
                }
                System.out.println("Valor " + i + " eliminado de la lista.");
            } else{
                lde_delete(node.node2, i);
            }
        } else{
            System.out.println("Valor " + i + " no existe en lista.");
        }
        return node;
    }
    
    private static void imprime_lde(BiNode nodo) {
        if (nodo != null) {
            System.out.print(nodo.data + " ");
            imprime_lde(nodo.node2);
        }
    }
    
}
