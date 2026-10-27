class Solution {
    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        int sum = 0;
        int c = 0;
        StringBuilder sb = new StringBuilder();

        while(i>=0 && j>=0){
            int x= a.charAt(i)-48;
            int y= b.charAt(j)-48;
            sum = c+x+y;
            System.out.println(sum);

            if(sum==0){
                sb.append(0);
                c=0;
            }
            else if(sum==1){
                sb.append(1);
                c=0;
            }
            else if(sum==2){
                sb.append(0);
                c=1;
            }
            else if(sum==3){
                sb.append(1);
                c=1;
            }

            i--;
            j--;
        }

        while(i>=0){
            int x= a.charAt(i)-48;
            sum = c+x;

            if(sum==0){
                sb.append(0);
                c=0;
            }
            else if(sum==1){
                sb.append(1);
                c=0;
            }
            else if(sum==2){
                sb.append(0);
                c=1;
            }
            else if(sum==3){
                sb.append(1);
                c=1;
            }

            i--;

        }

        while(j>=0){
            int y= b.charAt(j)-48;
            sum = c+y;

            if(sum==0){
                sb.append(0);
                c=0;
            }
            else if(sum==1){
                sb.append(1);
                c=0;
            }
            else if(sum==2){
                sb.append(0);
                c=1;
            }
            else if(sum==3){
                sb.append(1);
                c=1;
            }

            j--;

        }

        if(c>0) sb.append(1);

        return sb.reverse().toString();
    }
}