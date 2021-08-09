package stack.queue;

public class AnimalShelter {
    AnimalNode catFront;
    AnimalNode catTail;
    AnimalNode dogFront;
    AnimalNode dogTail;
    int catlength;
    int doglength;

    public AnimalShelter() {
        this.catFront=null;
        this.catTail=null;
        this.dogFront=null;
        this.dogTail=null;
        this.catlength=0;
        this.doglength=0;
    }

    public void enqueue(AnimalNode animal){

       // AnimalNode newAnimal=new AnimalNode(type);
        if(animal.type.equalsIgnoreCase("cat") ){
            catlength++;
            if(catTail == null){

                this.catFront=animal;
                this.catTail=animal;
            }
            else {
                this.catTail.next=animal;
                this.catTail=animal;
            }

        }
        else if( animal.type.equalsIgnoreCase("dog")){
            doglength++;
            if(dogTail == null){

                this.dogFront=animal;
                this.dogTail=animal;
            }
            else {
                this.dogTail.next=animal;
                this.dogTail=animal;
            }

        }
        else {
            System.out.println("animal can be either a dog or a cat only");
        }


    }
    public String dequeue(String pref) throws Exception {
        if(pref.equalsIgnoreCase("cat") && this.catFront !=null ){
            this.catFront = this.catFront.next;
            this.catlength--;
            return pref;
        }
        else if(pref.equalsIgnoreCase("dog") && this.dogFront !=null ){
            this.dogFront = this.dogFront.next;
            this.doglength--;
            return pref;
        }

       else if ( (this.catFront == null || this.dogFront == null) && (pref.equalsIgnoreCase("cat") || pref.equalsIgnoreCase("dog"))) {
            throw new Exception("you can not delete :the queue is empty");
        }
       else{

            System.out.println("animal can be either a dog or a cat only");
            return null;
        }



    }
}
