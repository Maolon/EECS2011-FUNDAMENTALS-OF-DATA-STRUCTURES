import java.util.Stack;

public class NewDeque<T> {
        Stack<T> front;
        Stack<T> back;

        NewDeque(){
            // reverse stack
            front = new Stack<>();
            // regular stack
            back = new Stack<>();
        }


        public void addLast(T e){
           if(e != null){
               back.push(e);

           }
        }

        public void addFirst(T e){
           if(e != null){
               front.push(e);

           }

        }

        public void removeFirst() throws NullPointerException{
            if(!front.isEmpty()){
                front.pop();

            }else{
                if(!back.isEmpty()){
                    backToFront();
                    front.pop();
                }
                else{
                    throw new NullPointerException("queue is empty");
                }
            }
        }

        public void removeLast() throws NullPointerException{
            if(!back.isEmpty()){
                back.pop();
            }else{
                if(!front.isEmpty()){
                    frontToBack();
                    back.pop();
                }else{
                    throw new NullPointerException("queue is empty");
                }

            }
        }

        public T first() throws NullPointerException{
           if(!front.isEmpty())
               return front.peek();
           else{
               if(!back.isEmpty()){
                   backToFront();
                   return front.peek();
               }else{
                   throw new NullPointerException("queue is empty");
               }

           }

        }

        public T last() throws NullPointerException{
           if(!back.isEmpty())
                return back.peek();
           else{
               if(!front.isEmpty()){
                   frontToBack();
                   return back.peek();
               }else{
                   throw new NullPointerException("queue is empty");
               }

           }

        }

        public int size(){
            return front.size() + back.size();
        }

        public boolean isEmpty(){
            return front.isEmpty() && back.isEmpty();
        }

        private void frontToBack(){
            back = new Stack<>();
            while(!front.isEmpty()){
                back.push(front.pop());
            }
        }

        private void backToFront(){
            front = new Stack<>();
            while(!back.isEmpty()){
                front.push(back.pop());
            }
        }

        private void printFront(){
            System.out.print("Front ");
            for(T e:front){
                System.out.print(" "+e+" ");
            }
            System.out.println();
        }

         private void printback(){
             System.out.print("Back ");
            for(T e:back){
                System.out.print(" "+e+" ");
            }
            System.out.println();
        }


        public static void main(String args[]){
            NewDeque<Integer> dq1 = new NewDeque<>();
            dq1.addFirst(1);
            dq1.printFront();
            dq1.printback();
            dq1.removeLast();
            dq1.printFront();
            dq1.printback();
            dq1.addFirst(2);
            dq1.addFirst(3);
            dq1.addFirst(4);
            dq1.addFirst(5);
            dq1.printFront();
            dq1.printback();
            dq1.removeLast();
            dq1.printFront();
            dq1.printback();
            dq1.addLast(6);
            dq1.addLast(7);
            dq1.printFront();
            dq1.printback();
            System.out.println(dq1.first());
            System.out.print(dq1.last());

         }






}
