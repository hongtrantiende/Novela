package defpackage;

import java.util.List;
import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uvc  reason: default package */
/* loaded from: classes3.dex */
public abstract class uvc {
    public static final mfb a = new mfb(new a1c(24));
    public static final mfb b = new mfb(new a1c(25));
    public static final mfb c = new mfb(new a1c(26));
    public static final mfb d = new mfb(new a1c(27));
    public static final mfb e = new mfb(new a1c(28));
    public static final mfb f = new mfb(new a1c(29));
    public static final mfb g = new mfb(new tvc(0));
    public static final mfb h = new mfb(new tvc(1));
    public static final gm9 i = new gm9("(?<![\\p{L}\\p{N}_])\\d{1,3}(?:,\\d{3})+(?:\\.\\d+)?(?![\\p{L}\\p{N}_])", 0);
    public static final gm9 j = new gm9("(?<![\\p{L}\\p{N}_])(\\d+(?:[.,]\\d+)?)\\s*[x*×]\\s*10\\^([-+]?\\d+)(?![\\p{L}\\p{N}_])", 0);
    public static final gm9 k = new gm9("([-–—])?(\\d+(?:[.,]\\d+)?e[+-]?\\d+)", 0);

    public static String a(String str) {
        List z0;
        String h2;
        String h3;
        str.getClass();
        if (str.length() == 0) {
            return "";
        }
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        if (k4b.W(lowerCase, 'e')) {
            String lowerCase2 = str.toLowerCase(locale);
            lowerCase2.getClass();
            int f0 = k4b.f0(lowerCase2, 'e', 0, 6);
            String substring = str.substring(0, f0);
            String substring2 = str.substring(f0 + 1);
            if (k4b.W(substring, '.')) {
                List z02 = k4b.z0(substring, new String[]{"."});
                String Q0 = k4b.Q0((String) z02.get(1), '0');
                if (Q0.length() > 0) {
                    h2 = eub.o(vte.h((String) z02.get(0)), " chấm ", vte.i(Q0));
                } else {
                    h2 = vte.h((String) z02.get(0));
                }
            } else if (k4b.W(substring, ',')) {
                List z03 = k4b.z0(substring, new String[]{","});
                String Q02 = k4b.Q0((String) z03.get(1), '0');
                if (Q02.length() > 0) {
                    h2 = eub.o(vte.h((String) z03.get(0)), " phẩy ", vte.i(Q02));
                } else {
                    h2 = vte.h((String) z03.get(0));
                }
            } else {
                h2 = vte.h(r4b.N(r4b.N(substring, false, ",", ""), false, ".", ""));
            }
            String S0 = k4b.S0(substring2, '+');
            if (k4b.B0(S0, '-')) {
                h3 = s21.m("trừ ", vte.h(S0.substring(1)));
            } else {
                h3 = vte.h(S0);
            }
            return eub.o(h2, " nhân mười mũ ", h3);
        } else if (k4b.W(str, ',') && k4b.W(str, '.')) {
            if (k4b.l0(str, '.', 0, 6) > k4b.l0(str, ',', 0, 6)) {
                z0 = k4b.z0(r4b.N(str, false, ",", ""), new String[]{"."});
            } else {
                z0 = k4b.z0(r4b.N(str, false, ".", ""), new String[]{","});
            }
            if (z0.size() < 2) {
                return vte.h(r4b.N(r4b.N(str, false, ",", ""), false, ".", ""));
            }
            String Q03 = k4b.Q0((String) z0.get(1), '0');
            if (Q03.length() == 0) {
                return vte.h((String) z0.get(0));
            }
            return eub.o(vte.h((String) z0.get(0)), " phẩy ", vte.i(Q03));
        } else if (!k4b.W(str, ',') && !k4b.W(str, '.')) {
            return vte.h(str);
        } else {
            if (k4b.W(str, ',')) {
                List z04 = k4b.z0(str, new String[]{","});
                if (z04.size() <= 2 && (z04.size() != 2 || ((String) z04.get(1)).length() != 3)) {
                    String Q04 = k4b.Q0((String) z04.get(1), '0');
                    if (Q04.length() == 0) {
                        return vte.h((String) z04.get(0));
                    }
                    return eub.o(vte.h((String) z04.get(0)), " phẩy ", vte.i(Q04));
                }
                return vte.h(r4b.N(str, false, ",", ""));
            }
            List z05 = k4b.z0(str, new String[]{"."});
            if (z05.size() <= 2 && (z05.size() != 2 || ((String) z05.get(1)).length() != 3)) {
                String Q05 = k4b.Q0((String) z05.get(1), '0');
                if (Q05.length() == 0) {
                    return vte.h((String) z05.get(0));
                }
                return eub.o(vte.h((String) z05.get(0)), " chấm ", vte.i(Q05));
            }
            return vte.h(r4b.N(str, false, ".", ""));
        }
    }
}
