package exercicio_02.services;

public class ValidadorSenha
{
    private static final String CARACTERES_ESPECIAIS = "!@#$%^&*()-_=+[]{};:,.<>?/\\|";

    public String validar(String senha)
    {
        if (senha.length() < 8)
        {
            return "a senha deve ter no mínimo 8 caracteres.";
        }

        boolean temMaiuscula = false;
        boolean temNumero = false;
        boolean temEspecial = false;

        for (int i = 0; i < senha.length(); i++)
        {
            char c = senha.charAt(i);

            if (Character.isUpperCase(c))
            {
                temMaiuscula = true;
            }
            else if (Character.isDigit(c))
            {
                temNumero = true;
            }
            else if (CARACTERES_ESPECIAIS.indexOf(c) != -1)
            {
                temEspecial = true;
            }
        }

        if (!temMaiuscula)
        {
            return "a senha deve conter pelo menos uma letra maiúscula.";
        }

        if (!temNumero)
        {
            return "a senha deve conter pelo menos um número.";
        }

        if (!temEspecial)
        {
            return "a senha deve conter pelo menos um caractere especial (@, #, $, etc.).";
        }

        return null; // passou em tudo
    }
}