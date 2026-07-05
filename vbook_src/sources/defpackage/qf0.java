package defpackage;

import android.view.View;
import androidx.media3.exoplayer.ExoPlayer;
import java.lang.reflect.Field;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qf0  reason: default package */
/* loaded from: classes.dex */
public final class qf0 implements hb3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qf0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.hb3
    public final void a() {
        we0 we0Var;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ws2 ws2Var = (ws2) obj2;
                we0 we0Var2 = (we0) obj;
                if (ws2Var.a.contains(we0Var2)) {
                    ws2Var.a = fca.s(ws2Var.a, we0Var2);
                    we0Var2.b = fca.s(we0Var2.b, ws2Var.d);
                    mce mceVar = ws2Var.b;
                    if (mceVar != null) {
                        we0Var = (we0) mceVar.a;
                    } else {
                        we0Var = null;
                    }
                    if (we0Var2 == we0Var && mceVar != null) {
                        mceVar.a = null;
                    }
                    ws2Var.a();
                    return;
                }
                vs.k("Callback is not registered");
                return;
            case 1:
                jf0 jf0Var = (jf0) obj2;
                xv1 xv1Var = (xv1) obj;
                if (jf0Var.a != null) {
                    xv1Var.b.h();
                    return;
                } else if (jf0Var.b != null) {
                    xv1Var.a.g();
                    return;
                } else {
                    vs.k("Unreachable");
                    return;
                }
            case 2:
                mj4 mj4Var = (mj4) obj2;
                String str = (String) obj;
                mj4Var.getClass();
                str.getClass();
                xl1.Q(mj4Var.a, new a23(str, 3));
                return;
            case 3:
                ((av5) obj2).a.j((yu5) obj);
                return;
            case 4:
                av2 av2Var = (av2) obj2;
                av2Var.getClass();
                av2Var.a.remove((i86) obj);
                return;
            case 5:
                ((qj6) obj2).c.k(obj);
                return;
            case 6:
                ((dw1) obj2).h();
                ((g08) obj).e = null;
                return;
            case 7:
                ss8 ss8Var = (ss8) obj2;
                float f = ((zc6) ((dt8) obj).a.d.getValue()).h;
                m82 a = idd.a(ss8Var);
                sw2 sw2Var = ab3.a;
                z87.v(a, ru2.c, null, new jo(ss8Var, f, null, 2), 2);
                return;
            case 8:
                ((xn6) obj2).f((rn6) obj);
                return;
            case 9:
                q7a q7aVar = (q7a) obj2;
                if (q7aVar.b == ((f7a) obj)) {
                    q7aVar.b = null;
                    q7aVar.a.setValue(null);
                    return;
                }
                return;
            case 10:
                z87.v((m82) obj2, null, null, new ov9((af) obj, (m42) null, 13), 3);
                return;
            case 11:
                aw7 aw7Var = (aw7) obj2;
                l59 l59Var = (l59) aw7Var.getValue();
                if (l59Var != null) {
                    k59 k59Var = new k59(l59Var);
                    yu7 yu7Var = (yu7) obj;
                    if (yu7Var != null) {
                        yu7Var.c(k59Var);
                    }
                    aw7Var.setValue(null);
                    return;
                }
                return;
            case 12:
                ((kvb) obj2).c.remove((xt4) obj);
                return;
            case 13:
                if (((cz7) obj2).a() instanceof li9) {
                    ((vfb) obj).a(tfb.c);
                    return;
                }
                return;
            case 14:
                ((tkc) obj2).k.remove((tkc) obj);
                return;
            case 15:
                tkc tkcVar = (tkc) obj2;
                tkcVar.getClass();
                okc okcVar = (okc) ((pkc) obj).b.getValue();
                if (okcVar != null) {
                    tkcVar.j.remove(okcVar.a);
                    return;
                }
                return;
            case 16:
                ((tkc) obj2).j.remove((skc) obj);
                return;
            case 17:
                ((i04) ((ExoPlayer) obj2)).E((r9d) obj);
                return;
            default:
                yjd yjdVar = (yjd) obj2;
                View view = (View) obj;
                int i2 = yjdVar.u - 1;
                yjdVar.u = i2;
                if (i2 == 0) {
                    Field field = rcd.a;
                    kcd.b(view, null);
                    rcd.d(view, null);
                    view.removeOnAttachStateChangeListener(yjdVar.v);
                    return;
                }
                return;
        }
    }
}
