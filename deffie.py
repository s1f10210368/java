import math
def g_a_mod_p(g, a, p):
    """
    Computes g^a mod p
    """
    return (g**a) % p
def Diffie_Hellman(g, a, b, p):
    """
    Computes the shared secret key
    """
    return (g_a_mod_p(g, a, p))**b % p