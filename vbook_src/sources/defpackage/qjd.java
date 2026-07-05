package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qjd  reason: default package */
/* loaded from: classes.dex */
public class qjd {
    public static final tjd b;
    public final tjd a;

    static {
        hjd ajdVar;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            ajdVar = new gjd();
        } else if (i >= 35) {
            ajdVar = new fjd();
        } else if (i >= 34) {
            ajdVar = new ejd();
        } else if (i >= 31) {
            ajdVar = new djd();
        } else if (i >= 30) {
            ajdVar = new cjd();
        } else if (i >= 29) {
            ajdVar = new bjd();
        } else {
            ajdVar = new ajd();
        }
        b = ajdVar.b().a.a().a.b().a.c();
    }

    public qjd(tjd tjdVar) {
        this.a = tjdVar;
    }

    public tjd a() {
        return this.a;
    }

    public tjd b() {
        return this.a;
    }

    public tjd c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qjd)) {
            return false;
        }
        qjd qjdVar = (qjd) obj;
        if (t() == qjdVar.t() && s() == qjdVar.s() && Objects.equals(n(), qjdVar.n()) && Objects.equals(l(), qjdVar.l()) && Objects.equals(h(), qjdVar.h())) {
            return true;
        }
        return false;
    }

    public List<Rect> f(int i) {
        return Collections.EMPTY_LIST;
    }

    public List<Rect> g(int i) {
        return Collections.EMPTY_LIST;
    }

    public bb3 h() {
        return null;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(t()), Boolean.valueOf(s()), n(), l(), h());
    }

    public cx5 i(int i) {
        return cx5.e;
    }

    public cx5 j(int i) {
        if ((i & 8) == 0) {
            return cx5.e;
        }
        vs.m("Unable to query the maximum insets for IME");
        return null;
    }

    public cx5 k() {
        return n();
    }

    public cx5 l() {
        return cx5.e;
    }

    public cx5 m() {
        return n();
    }

    public cx5 n() {
        return cx5.e;
    }

    public cx5 o() {
        return n();
    }

    public tjd r(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean s() {
        return false;
    }

    public boolean t() {
        return false;
    }

    public boolean u(int i) {
        return true;
    }

    public void q() {
    }

    public void A(int i) {
    }

    public void B(Rect[][] rectArr) {
    }

    public void C(Rect[][] rectArr) {
    }

    public void d(View view) {
    }

    public void e(tjd tjdVar) {
    }

    public void p(View view) {
    }

    public void v(db3 db3Var) {
    }

    public void w(cx5[] cx5VarArr) {
    }

    public void x(cx5 cx5Var) {
    }

    public void y(tjd tjdVar) {
    }

    public void z(cx5 cx5Var) {
    }
}
