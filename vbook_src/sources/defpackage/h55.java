package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h55  reason: default package */
/* loaded from: classes3.dex */
public final class h55 implements vfd {
    public final /* synthetic */ i55 a;

    public h55(i55 i55Var) {
        this.a = i55Var;
    }

    @Override // defpackage.vfd
    public final ygd g(String str) {
        bt1 bt1Var;
        boolean z;
        i55 i55Var = this.a;
        synchronized (i55Var.h) {
            try {
                i55Var.c.add(str);
                s45 s45Var = i55Var.g;
                if (s45Var != null) {
                    ArrayList arrayList = s45Var.a;
                    if (!arrayList.isEmpty()) {
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            if (((gm9) obj).g(str)) {
                                bt1Var = s45Var.b;
                                break;
                            }
                        }
                    }
                }
                bt1Var = null;
                List<gm9> list = i55Var.d;
                if (list == null || !list.isEmpty()) {
                    for (gm9 gm9Var : list) {
                        if (gm9Var.g(str)) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bt1Var != null) {
            bt1Var.P(pvc.a);
        }
        if (!z) {
            return null;
        }
        return new ygd(new byte[0]);
    }

    @Override // defpackage.vfd
    public final void w(String str, nl5 nl5Var) {
        str.getClass();
    }

    @Override // defpackage.vfd
    public final void x(String str) {
        bt1 bt1Var;
        i55 i55Var = this.a;
        synchronized (i55Var.h) {
            bt1Var = i55Var.f;
        }
        if (bt1Var != null) {
            bt1Var.P(pvc.a);
        }
    }

    @Override // defpackage.vfd
    public final void l(int i) {
    }
}
