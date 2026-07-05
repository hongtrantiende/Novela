package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wid  reason: default package */
/* loaded from: classes.dex */
public final class wid extends WindowInsetsAnimation$Callback {
    public final xb1 a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public wid(xb1 xb1Var) {
        super(xb1Var.b);
        this.d = new HashMap();
        this.a = xb1Var;
    }

    public final zid a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap hashMap = this.d;
        zid zidVar = (zid) hashMap.get(windowInsetsAnimation);
        if (zidVar == null) {
            zid zidVar2 = new zid(0, null, 0L);
            zidVar2.a = new xid(windowInsetsAnimation);
            hashMap.put(windowInsetsAnimation, zidVar2);
            return zidVar2;
        }
        return zidVar;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.d(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.e(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            zid a = a(windowInsetsAnimation);
            a.a.d(windowInsetsAnimation.getFraction());
            this.c.add(a);
        }
        return this.a.f(tjd.c(windowInsets, null), this.b).b();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        rwa g = this.a.g(a(windowInsetsAnimation), new rwa(bounds));
        g.getClass();
        vid.c();
        return vid.a(((cx5) g.b).d(), ((cx5) g.c).d());
    }
}
