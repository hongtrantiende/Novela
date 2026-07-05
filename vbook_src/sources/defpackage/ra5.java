package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ra5  reason: default package */
/* loaded from: classes.dex */
public final class ra5 {
    public final HashSet a = fca.m("address", "article", "aside", "blockquote", "canvas", "dd", "div", "dl", "dt", "fieldset", "figcaption", "figure", "footer", "form", "h1", "h2", "h3", "h4", "h5", "h6", "header", "hr", "li", "main", "nav", "noscript", "ol", "p", "pre", "section", "table", "tfoot", "ul", "video");
    public final HashMap b = o17.q(new yk8("h1", new e4c(zr1.x(2.0f, 8589934592L))), new yk8("h2", new e4c(zr1.o(1.75d))), new yk8("h3", new e4c(zr1.o(1.5d))), new yk8("h4", new e4c(zr1.o(1.25d))), new yk8("h5", new e4c(zr1.o(1.125d))), new yk8("h6", new e4c(zr1.x(1.0f, 8589934592L))));
    public final HashSet c = fca.m("a", "abbr", "acronym", "b", "bdo", "big", "br", "button", "cite", "code", "dfn", "em", "emphasis", "i", "u", "img", "image", "input", "kbd", "label", "map", "output", "q", "s", "script", "select", "small", "span", "strong", "sub", "sup", "textarea", "time", "tt");
    public boolean d;

    public static void b(ra5 ra5Var, ns nsVar, String str) {
        if ("�".length() > 0) {
            nsVar.i("androidx.compose.foundation.text.inlineContent", str);
            nsVar.f("�");
            nsVar.g();
            return;
        }
        vs.m("alternateText can't be an empty string.");
    }

    public final void a(ns nsVar, y28 y28Var, boolean z) {
        dq4 dq4Var;
        float f;
        uw4 uw4Var;
        int j;
        boolean z2;
        long j2;
        dq4 dq4Var2;
        uw4 uw4Var2;
        long j3;
        String u = y28Var.u();
        boolean contains = this.a.contains(u);
        uw4 uw4Var3 = eo4.d;
        int i = 0;
        rub rubVar = null;
        if (contains) {
            e4c e4cVar = (e4c) this.b.get(u);
            if (e4cVar != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            m5b a = bl8.a(y28Var.c("style"));
            if (e4cVar != null) {
                j2 = e4cVar.a;
            } else {
                j2 = a.d;
            }
            long j4 = j2;
            long j5 = a.b;
            long j6 = a.c;
            if (z2) {
                dq4Var2 = dq4.D;
            } else {
                dq4Var2 = dq4.e;
            }
            dq4 dq4Var3 = dq4Var2;
            if (c16.i(u, "pre")) {
                uw4Var2 = uw4Var3;
            } else {
                uw4Var2 = null;
            }
            uva uvaVar = new uva(j5, j4, dq4Var3, null, new xp4(65535), uw4Var2, null, 0L, null, null, null, j6, null, null, 63432);
            if (!z) {
                if (e4cVar != null) {
                    j3 = e4cVar.a;
                } else {
                    j3 = e4c.c;
                }
                long j7 = j3;
                if (z2) {
                    i = mo6.c;
                }
                int i2 = i;
                int i3 = a.a;
                if (i3 == 3) {
                    rubVar = new rub(0L, 3);
                }
                ms msVar = new ms(nsVar.a.length(), 0, 12, new pl8(i3, j7, rubVar, i2, 434), null);
                ArrayList arrayList = nsVar.b;
                arrayList.add(msVar);
                nsVar.c.add(msVar);
                int size = arrayList.size() - 1;
                try {
                    j = nsVar.j(uvaVar);
                    c(nsVar, y28Var, true);
                } finally {
                    nsVar.h(size);
                }
            } else {
                j = nsVar.j(uvaVar);
                try {
                    c(nsVar, y28Var, true);
                } finally {
                }
            }
            if (!this.d) {
                nsVar.f("\n");
                this.d = true;
            }
        } else if (this.c.contains(u)) {
            m5b a2 = bl8.a(y28Var.c("style"));
            int hashCode = u.hashCode();
            if (hashCode == 105 ? u.equals("i") : !(hashCode == 3240 ? !u.equals("em") : !(hashCode == 1189352828 && u.equals("emphasis")))) {
                i = 1;
            }
            if (!u.equals("b") && !u.equals("strong")) {
                dq4Var = dq4.e;
            } else {
                dq4Var = dq4.D;
            }
            dq4 dq4Var4 = dq4Var;
            boolean equals = u.equals("u");
            gpb gpbVar = gpb.c;
            if (!equals) {
                if (u.equals("s")) {
                    gpbVar = gpb.d;
                } else if (!u.equals("a") || y28Var.c("href").length() <= 0) {
                    gpbVar = gpb.b;
                }
            }
            gpb gpbVar2 = gpbVar;
            if (u.equals("sup")) {
                f = 0.5f;
            } else if (u.equals("sub")) {
                f = -0.5f;
            } else {
                f = nae.e;
            }
            if (u.equals("code")) {
                uw4Var = uw4Var3;
            } else {
                uw4Var = null;
            }
            j = nsVar.j(new uva(a2.b, a2.d, dq4Var4, new wp4(i), null, uw4Var, null, 0L, new oi0(f), null, null, a2.c, gpbVar2, null, 59088));
            try {
                c(nsVar, y28Var, z);
            } finally {
            }
        } else {
            c(nsVar, y28Var, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x01f1, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.ns r19, defpackage.y28 r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ra5.c(ns, y28, boolean):void");
    }

    public final ps d(cp3 cp3Var) {
        cp3Var.getClass();
        ns nsVar = new ns();
        a(nsVar, cp3Var, false);
        return nsVar.k();
    }
}
