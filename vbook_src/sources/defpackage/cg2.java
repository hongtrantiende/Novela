package defpackage;

import java.util.regex.Pattern;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cg2  reason: default package */
/* loaded from: classes.dex */
public final class cg2 extends al6 {
    static {
        hm9 hm9Var = hm9.IGNORE_CASE;
        hm9 hm9Var2 = hm9.MULTILINE;
        int i = 0;
        int i2 = 0;
        for (hm9 hm9Var3 : b00.F0(new hm9[]{hm9Var, hm9Var2})) {
            i2 |= hm9Var3.a;
        }
        Pattern.compile("eval[(]function[(]p,a,c,k,e,[rd][)][{].*?[}][)]{2}", h88.h(i2)).getClass();
        int i3 = 0;
        for (hm9 hm9Var4 : b00.F0(new hm9[]{hm9Var, hm9Var2})) {
            i3 |= hm9Var4.a;
        }
        Pattern.compile("[}][(]'(.*)', *(\\d+), *(\\d+), *'(.*?)'[.]split[(]'[|]'[)]", h88.h(i3)).getClass();
        for (hm9 hm9Var5 : b00.F0(new hm9[]{hm9Var, hm9Var2})) {
            i |= hm9Var5.a;
        }
        Pattern.compile("\\b\\w+\\b", h88.h(i)).getClass();
    }

    @Override // defpackage.y28
    public final Object clone() {
        return (cg2) super.clone();
    }

    @Override // defpackage.y28
    public final y28 i() {
        return (cg2) super.clone();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, al6, y28] */
    @Override // defpackage.y28
    public final y28 j() {
        Object obj = this.d;
        obj.getClass();
        ?? obj2 = new Object();
        obj2.d = (String) obj;
        return obj2;
    }

    @Override // defpackage.y28
    public final String u() {
        return "#data";
    }

    @Override // defpackage.y28
    public final void y(bp3 bp3Var, sc3 sc3Var) {
        String H = H();
        if (sc3Var.g == rc3.b && !k4b.V(H, "<![CDATA[", false)) {
            cp3 cp3Var = this.a;
            if (cp3Var != null && c16.i(cp3Var.e.b, "script")) {
                bp3Var.c("//<![CDATA[\n");
                bp3Var.c(H);
                bp3Var.c("\n//]]>");
                return;
            }
            cp3 cp3Var2 = this.a;
            if (cp3Var2 != null && c16.i(cp3Var2.e.b, "style")) {
                bp3Var.c("/*<![CDATA[*/\n");
                bp3Var.c(H);
                bp3Var.c("\n/*]]>*/");
                return;
            }
            bp3Var.c("<![CDATA[");
            bp3Var.c(H);
            bp3Var.c("]]>");
            return;
        }
        bp3Var.c(H);
    }
}
