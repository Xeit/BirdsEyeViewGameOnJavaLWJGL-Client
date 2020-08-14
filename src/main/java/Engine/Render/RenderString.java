package Engine.Render;

import Engine.Values.Letters;

import static Engine.Render.RenderTexture.renderLetter;

/**
 * Class used to render text
 * Klasa do renderowania textu
 */
public class RenderString extends Letters
{
    /**
     * @param text - text that we want to show / text, ktory chcemy wyswietlic
     * @param scale - scale that we want to use to render text (please use unsigned int for that, only then it looks ok) /
     *             skala w jakiej chcemy wyswietlic text (liczby nie calkowite nie wyswietlaja ladnie z powodu ilosci pixeli)
     * @param posX - starting position of X (down left X) / pozycja startowa X (dolny lewy X)
     * @param posY - starting position of Y (down left Y) / pozycja startowa Y (dolny lewy Y)
     */
    public RenderString(String text, Float scale, Float posX, Float posY)
    {
        for(Character letter : text.toCharArray())
        {
            if(letter.equals(' '))
            {
                Float width = space_file.getWidth() * scale;
                Float height = space_file.getHeight() * scale;
                renderLetter(space, posX, posY, width, height);
                posX += width + 2f;
            }
            else if(letter.equals('a'))
            {
                Float width = a_file.getWidth() * scale;
                Float height = a_file.getHeight() * scale;
                renderLetter(a, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('A'))
            {
                Float width = A_file.getWidth() * scale;
                Float height = A_file.getHeight() * scale;
                renderLetter(A, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('b'))
            {
                Float width = b_file.getWidth() * scale;
                Float height = b_file.getHeight() * scale;
                renderLetter(b, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('B'))
            {
                Float width = B_file.getWidth() * scale;
                Float height = B_file.getHeight() * scale;
                renderLetter(B, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('c'))
            {
                Float width = c_file.getWidth() * scale;
                Float height = c_file.getHeight() * scale;
                renderLetter(c, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('C'))
            {
                Float width = C_file.getWidth() * scale;
                Float height = C_file.getHeight() * scale;
                renderLetter(C, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('d'))
            {
                Float width = d_file.getWidth() * scale;
                Float height = d_file.getHeight() * scale;
                renderLetter(d, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('D'))
            {
                Float width = D_file.getWidth() * scale;
                Float height = D_file.getHeight() * scale;
                renderLetter(D, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('e'))
            {
                Float width = e_file.getWidth() * scale;
                Float height = e_file.getHeight() * scale;
                renderLetter(e, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('E'))
            {
                Float width = E_file.getWidth() * scale;
                Float height = E_file.getHeight() * scale;
                renderLetter(E, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('f'))
            {
                Float width = f_file.getWidth() * scale;
                Float height = f_file.getHeight() * scale;
                renderLetter(f, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('F'))
            {
                Float width = F_file.getWidth() * scale;
                Float height = F_file.getHeight() * scale;
                renderLetter(F, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('g'))
            {
                Float width = g_file.getWidth() * scale;
                Float height = g_file.getHeight() * scale;
                renderLetter(g, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('G'))
            {
                Float width = G_file.getWidth() * scale;
                Float height = G_file.getHeight() * scale;
                renderLetter(G, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('h'))
            {
                Float width = h_file.getWidth() * scale;
                Float height = h_file.getHeight() * scale;
                renderLetter(h, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('H'))
            {
                Float width = H_file.getWidth() * scale;
                Float height = H_file.getHeight() * scale;
                renderLetter(H, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('i'))
            {
                Float width = i_file.getWidth() * scale;
                Float height = i_file.getHeight() * scale;
                renderLetter(i, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('I'))
            {
                Float width = I_file.getWidth() * scale;
                Float height = I_file.getHeight() * scale;
                renderLetter(I, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('j'))
            {
                Float width = j_file.getWidth() * scale;
                Float height = j_file.getHeight() * scale;
                renderLetter(j, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('J'))
            {
                Float width = J_file.getWidth() * scale;
                Float height = J_file.getHeight() * scale;
                renderLetter(J, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('k'))
            {
                Float width = k_file.getWidth() * scale;
                Float height = k_file.getHeight() * scale;
                renderLetter(k, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('K'))
            {
                Float width = K_file.getWidth() * scale;
                Float height = K_file.getHeight() * scale;
                renderLetter(K, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('l'))
            {
                Float width = l_file.getWidth() * scale;
                Float height = l_file.getHeight() * scale;
                renderLetter(l, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('L'))
            {
                Float width = L_file.getWidth() * scale;
                Float height = L_file.getHeight() * scale;
                renderLetter(L, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('m'))
            {
                Float width = m_file.getWidth() * scale;
                Float height = m_file.getHeight() * scale;
                renderLetter(m, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('M'))
            {
                Float width = M_file.getWidth() * scale;
                Float height = M_file.getHeight() * scale;
                renderLetter(M, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('n'))
            {
                Float width = n_file.getWidth() * scale;
                Float height = n_file.getHeight() * scale;
                renderLetter(n, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('N'))
            {
                Float width = N_file.getWidth() * scale;
                Float height = N_file.getHeight() * scale;
                renderLetter(N, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('o'))
            {
                Float width = o_file.getWidth() * scale;
                Float height = o_file.getHeight() * scale;
                renderLetter(o, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('O'))
            {
                Float width = O_file.getWidth() * scale;
                Float height = O_file.getHeight() * scale;
                renderLetter(O, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('p'))
            {
                Float width = p_file.getWidth() * scale;
                Float height = p_file.getHeight() * scale;
                renderLetter(p, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('P'))
            {
                Float width = P_file.getWidth() * scale;
                Float height = P_file.getHeight() * scale;
                renderLetter(P, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('q'))
            {
                Float width = q_file.getWidth() * scale;
                Float height = q_file.getHeight() * scale;
                renderLetter(q, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('Q'))
            {
                Float width = Q_file.getWidth() * scale;
                Float height = Q_file.getHeight() * scale;
                renderLetter(Q, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('r'))
            {
                Float width = r_file.getWidth() * scale;
                Float height = r_file.getHeight() * scale;
                renderLetter(r, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('R'))
            {
                Float width = R_file.getWidth() * scale;
                Float height = R_file.getHeight() * scale;
                renderLetter(R, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('s'))
            {
                Float width = s_file.getWidth() * scale;
                Float height = s_file.getHeight() * scale;
                renderLetter(s, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('S'))
            {
                Float width = S_file.getWidth() * scale;
                Float height = S_file.getHeight() * scale;
                renderLetter(S, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('t'))
            {
                Float width = t_file.getWidth() * scale;
                Float height = t_file.getHeight() * scale;
                renderLetter(t, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('T'))
            {
                Float width = T_file.getWidth() * scale;
                Float height = T_file.getHeight() * scale;
                renderLetter(T, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('u'))
            {
                Float width = u_file.getWidth() * scale;
                Float height = u_file.getHeight() * scale;
                renderLetter(u, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('U'))
            {
                Float width = U_file.getWidth() * scale;
                Float height = U_file.getHeight() * scale;
                renderLetter(U, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('v'))
            {
                Float width = v_file.getWidth() * scale;
                Float height = v_file.getHeight() * scale;
                renderLetter(v, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('V'))
            {
                Float width = V_file.getWidth() * scale;
                Float height = V_file.getHeight() * scale;
                renderLetter(V, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('w'))
            {
                Float width = w_file.getWidth() * scale;
                Float height = w_file.getHeight() * scale;
                renderLetter(w, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('W'))
            {
                Float width = W_file.getWidth() * scale;
                Float height = W_file.getHeight() * scale;
                renderLetter(W, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('x'))
            {
                Float width = x_file.getWidth() * scale;
                Float height = x_file.getHeight() * scale;
                renderLetter(x, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('X'))
            {
                Float width = X_file.getWidth() * scale;
                Float height = X_file.getHeight() * scale;
                renderLetter(X, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('y'))
            {
                Float width = y_file.getWidth() * scale;
                Float height = y_file.getHeight() * scale;
                renderLetter(y, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('Y'))
            {
                Float width = Y_file.getWidth() * scale;
                Float height = Y_file.getHeight() * scale;
                renderLetter(Y, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('z'))
            {
                Float width = z_file.getWidth() * scale;
                Float height = z_file.getHeight() * scale;
                renderLetter(z, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('Z'))
            {
                Float width = Z_file.getWidth() * scale;
                Float height = Z_file.getHeight() * scale;
                renderLetter(Z, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('0'))
            {
                Float width = zero_file.getWidth() * scale;
                Float height = zero_file.getHeight() * scale;
                renderLetter(zero, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('1'))
            {
                Float width = one_file.getWidth() * scale;
                Float height = one_file.getHeight() * scale;
                renderLetter(one, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('2'))
            {
                Float width = two_file.getWidth() * scale;
                Float height = two_file.getHeight() * scale;
                renderLetter(two, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('3'))
            {
                Float width = three_file.getWidth() * scale;
                Float height = three_file.getHeight() * scale;
                renderLetter(three, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('4'))
            {
                Float width = four_file.getWidth() * scale;
                Float height = four_file.getHeight() * scale;
                renderLetter(four, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('5'))
            {
                Float width = five_file.getWidth() * scale;
                Float height = five_file.getHeight() * scale;
                renderLetter(five, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('6'))
            {
                Float width = six_file.getWidth() * scale;
                Float height = six_file.getHeight() * scale;
                renderLetter(six, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('7'))
            {
                Float width = seven_file.getWidth() * scale;
                Float height = seven_file.getHeight() * scale;
                renderLetter(seven, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('8'))
            {
                Float width = eight_file.getWidth() * scale;
                Float height = eight_file.getHeight() * scale;
                renderLetter(eight, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('9'))
            {
                Float width = nine_file.getWidth() * scale;
                Float height = nine_file.getHeight() * scale;
                renderLetter(nine, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('.'))
            {
                Float width = dot_file.getWidth() * scale;
                Float height = dot_file.getHeight() * scale;
                renderLetter(dot, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals(','))
            {
                Float width = comma_file.getWidth() * scale;
                Float height = comma_file.getHeight() * scale;
                renderLetter(comma, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals(';'))
            {
                Float width = semicolon_file.getWidth() * scale;
                Float height = semicolon_file.getHeight() * scale;
                renderLetter(semicolon, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals(':'))
            {
                Float width = colon_file.getWidth() * scale;
                Float height = colon_file.getHeight() * scale;
                renderLetter(colon, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('!'))
            {
                Float width = exclamationMark_file.getWidth() * scale;
                Float height = exclamationMark_file.getHeight() * scale;
                renderLetter(exclamationMark, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('?'))
            {
                Float width = questionMark_file.getWidth() * scale;
                Float height = questionMark_file.getHeight() * scale;
                renderLetter(questionMark, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('/'))
            {
                Float width = slashRight_file.getWidth() * scale;
                Float height = slashRight_file.getHeight() * scale;
                renderLetter(slashRight, posX, posY, width, height);
                posX += width + 2f;
            }else if(letter.equals('\\'))
            {
                Float width = slashLeft_file.getWidth() * scale;
                Float height = slashLeft_file.getHeight() * scale;
                renderLetter(slashLeft, posX, posY, width, height);
                posX += width + 2f;
            }else
            {
                System.out.println("Missing letter!");
            }
        }
    }
}
