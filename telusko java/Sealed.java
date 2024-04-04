
sealed class Asdf permits Bnm,Cvb{// permits properties of class Asdf o only Bnm and Cvb only but not Dfg
// sealed class acts as barrier where only some class are able to inheric this class properties
}
final class Bnm extends Asdf{
//  class should be either final, sealed, non-sealed or else it will give error
}
final class Cvb extends Asdf{
//  class should be either final, sealed, non-sealed or else it will give error

}
class Dfg{
// this class is not inherited by the class Asdf
}
public class Sealed {
    public static void main(String[] args) {
        
    }
}
