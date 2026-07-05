package defpackage;

import java.util.regex.Pattern;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sta  reason: default package */
/* loaded from: classes3.dex */
public final class sta {
    public static final int[] d = {990, Token.ASSIGN_DIV, 901, 640, 811, 890, Token.ASSIGN_DIV, Token.ASSIGN_DIV, 701, 640, 790, 211, 211};
    public static final byte[] e = new byte[16];
    public final String a;
    public final String b;
    public final mfb c;

    public sta(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = new mfb(new ak9(this, 22));
    }

    public final String a(String str) {
        int[] iArr = h.g;
        e31 e31Var = e31.d;
        String n = s21.n("x0P2Xx", s21.n("x0P1Xx", str, "\\+"), "/");
        Pattern compile = Pattern.compile("x0P3Xx");
        compile.getClass();
        String replaceAll = compile.matcher(n).replaceAll("=");
        replaceAll.getClass();
        e31 l = p40.l(replaceAll);
        l.getClass();
        return r4b.F(cbe.i(l.s(), (byte[]) this.c.getValue(), e, qh1.l));
    }

    public final String b(String str) {
        e31 e31Var = e31.d;
        int[] iArr = h.g;
        String a = p40.p(cbe.j(r4b.H(str), (byte[]) this.c.getValue(), e, qh1.l)).a();
        Pattern compile = Pattern.compile("\\+");
        compile.getClass();
        a.getClass();
        String replaceAll = compile.matcher(a).replaceAll("x0P1Xx");
        replaceAll.getClass();
        return s21.n("=", s21.n("/", replaceAll, "x0P2Xx"), "x0P3Xx");
    }
}
