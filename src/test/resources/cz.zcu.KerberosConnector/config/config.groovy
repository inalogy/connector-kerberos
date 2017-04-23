/* +---------------------------------------------------+
 *  ----------- Contract Tests configuration ------------
 *  +---------------------------------------------------+
 */

import org.identityconnectors.common.security.GuardedString


configuration{
    // see jni/kadm5_fake.c
    principal="admin@EXAMPLE.COM"
    password=new GuardedString("password".toCharArray())
    realm="EXAMPLE.COM"
}

environments {
    CaseSuccess{
        configuration {
        }
    }
    BadPassword {
        configuration {
            password=new GuardedString("password2".toCharArray())
        }
    }
}
