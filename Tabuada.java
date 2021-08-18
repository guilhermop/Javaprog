echo "# Javaprog" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/guilhermop/Javaprog.git
git push -u origin main

    public static void main(String[] args){
        int d=10;
        int i=1;
        int v= 0;
    
        while(v < 99){
            v=d*i;
            i++;
            System.out.printf("/n %d",v);
        }
    
        }
    }