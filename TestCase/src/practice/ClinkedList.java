package practice;


	public class ClinkedList 
	{
   
		  public class Node
		  {
			  Object data;
			  Node next;
			
			  public Node(String data) 
			  {
				  this.data=data;
			  }
		  }

		  Node head, head1, head2;
		  Node tail;
		  
	   public void addFirst(String obj)
	   {
		   Node n=new Node(obj);
		     if(head==null) 
		     {
		    	 head=n;
		    	 head.next=head;
		     }
		   
		     else 
		     {
		    	 Node t=head;
		    	 n.next=t;
		    	 head=n;
		     }
	   }   
		      public void addLast(String obj) 
		      {
		    	  Node n=new Node(obj);
		    	  Node t=head;
		    	  while(t!=head)
		    	  t=t.next;
		    	  t.next=n;
		    	  n.next=head;
		    	  
		      }
		   
		      
		      public void removeFirst() 
		      {
		    	 Node t=head;
		    	 while(t!=head)
		    		 t=t.next;
		    	
		    	 t.next=head.next;
		    	  
		      }
		      
		      
		      public void removeLast() {
		    	  Node prev =null;
		    	  Node t=head;
		    	  while(t!=head) 
		    	  {
		    		 prev=t;
		    		  t=t.next;
		    		  
		    	  }
		    	  prev.next=t.next;
		    	   t.next=null;
		      }
		      
   
		   public void print(Node head) {
			   Node t=head;
			   while(t!=head) {
				   System.out.println(t.data + " "); 
				   t=t.next;
				   
			   }
		   }
		   
		   public void split() {
			   Node n1=head;
			   Node n2=head;
			   
			   while(n1.next.next!=head && n1.next!=head) {
				   n1=n1.next.next;
				   n2=n2.next;
			   }
			   
			   if(n1.next.next==head) {
				   n1= n1.next;
			   }
			   head1=head;
			   if(head.next!=head)
			   {
				   head2=n2.next;
			   }
			    n1.next=head2;
			    n2.next=head1;
			    
			 
		   }
			   
		public static void main(String[] args) {
			ClinkedList cl= new ClinkedList();
			cl.addFirst("a");
			cl.addLast("b");
			cl.addFirst("c");
			cl.addLast("d");
			cl.addFirst("e");
			cl.removeFirst();
	          cl.print(cl.head);
	          cl.split();
	          System.out.println("the first half of linked list is");
	          cl.print(cl.head1);
	          System.out.println("the second half of linked list is");
	          cl.print(cl.head2);
		} 
}

