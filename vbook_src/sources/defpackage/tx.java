package defpackage;

import android.content.res.Resources;
import android.os.LocaleList;
import java.util.Iterator;
import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tx  reason: default package */
/* loaded from: classes3.dex */
public final class tx extends fdd {
    public final h58 C;
    public final wxc D;
    public final zk E;
    public final ib4 F;
    public final cza G;
    public final cza H;
    public final s02 I;
    public final sw c;
    public final wl6 d;
    public final yca e;
    public final i6c f;

    /* JADX WARN: Type inference failed for: r10v3, types: [aab, nu4] */
    public tx(sw swVar, wl6 wl6Var, yca ycaVar, i6c i6cVar, h58 h58Var, wxc wxcVar, zk zkVar, ib4 ib4Var) {
        Object obj;
        ex exVar;
        this.c = swVar;
        this.d = wl6Var;
        this.e = ycaVar;
        this.f = i6cVar;
        this.C = h58Var;
        this.D = wxcVar;
        this.E = zkVar;
        this.F = ib4Var;
        bda bdaVar = (bda) ycaVar;
        Iterator it = rb6.a.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                String str = ((kb6) obj).b;
                dx dxVar = bdaVar.a;
                if (str.equals((String) dxVar.b.c(dx.W[0], dxVar))) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        kb6 kb6Var = (kb6) obj;
        p69 p69Var = mv6.b;
        if (kb6Var == null) {
            p69Var.c(xve.c(""));
            pv6 pv6Var = pv6.b;
            Locale a = pv6.c(LocaleList.getAdjustedDefault()).a(0);
            if (a == null && (a = Resources.getSystem().getConfiguration().getLocales().get(0)) == null) {
                a = Locale.getDefault();
            }
            a.getClass();
            String languageTag = a.toLanguageTag();
            languageTag.getClass();
            exVar = new ex(languageTag);
        } else {
            mv6 e = vve.e(kb6Var.b);
            e = e == null ? vve.g() : e;
            p69Var.c(e.a);
            exVar = new ex(e.e());
        }
        this.G = dza.a(exVar);
        this.H = dza.a(new x6c(0L, null, 0, false, false, false, false, 0, 0.0d, nae.e, nae.e, null, 0, null, nae.e, 65535));
        this.I = new s02();
        n6c n6cVar = (n6c) this.f;
        sj4 A = z1d.A(z1d.x(z1d.A(new mx(n6cVar.b, 2)), z1d.A(z1d.w(n6cVar.g, n6cVar.i, n6cVar.j, n6cVar.k, n6cVar.h, new qx(null))), z1d.A(z1d.w(n6cVar.c, z1d.A(new mx(n6cVar.d, 0)), n6cVar.m, n6cVar.n, z1d.A(new mx(n6cVar.l, 1)), new px(null))), z1d.A(z1d.y(n6cVar.o, n6cVar.p, n6cVar.q, new aab(4, null))), new r84(5, 2, null)));
        sw2 sw2Var = ab3.a;
        ru2 ru2Var = ru2.c;
        z1d.H(new ok4(z1d.G(A, ru2Var), new hx(this, null, 1), 2), jdd.a(this));
        z1d.H(new ok4(new mx((bw7) ((bda) this.e).d.getValue(), 8), new hx(this, null, 0), 2), jdd.a(this));
        f(jdd.a(this), ru2Var, new fx(this, null, 0));
        f(jdd.a(this), ru2Var, new fx(this, null, 1));
        f(jdd.a(this), ru2Var, new fx(this, null, 2));
        f(jdd.a(this), ru2Var, new l0(this, null, 19));
    }
}
