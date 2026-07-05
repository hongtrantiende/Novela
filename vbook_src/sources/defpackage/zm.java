package defpackage;

import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zm  reason: default package */
/* loaded from: classes.dex */
public final class zm {
    public final an a;
    public final xm b;
    public final xm c;
    public final View d;

    public zm(an anVar, xm xmVar, xm xmVar2, View view) {
        this.a = anVar;
        this.b = xmVar;
        this.c = xmVar2;
        this.d = view;
    }

    public final boolean a(Menu menu) {
        int i;
        nob nobVar = (nob) this.b.invoke();
        if (c16.i(nobVar, null)) {
            return false;
        }
        menu.clear();
        List list = nobVar.a;
        int size = list.size();
        int i2 = 1;
        int i3 = 1;
        for (int i4 = 0; i4 < size; i4++) {
            mob mobVar = (mob) list.get(i4);
            if (mobVar instanceof uob) {
                int i5 = i2 + 1;
                Object obj = mobVar.a;
                if (c16.i(obj, b23.f)) {
                    i = 16908320;
                } else if (c16.i(obj, b23.g)) {
                    i = 16908321;
                } else if (c16.i(obj, b23.h)) {
                    i = 16908322;
                } else if (c16.i(obj, b23.i)) {
                    i = 16908319;
                } else if (c16.i(obj, b23.j)) {
                    i = 16908355;
                } else {
                    i = i2;
                }
                uob uobVar = (uob) mobVar;
                MenuItem add = menu.add(i3, i, i2, uobVar.b);
                add.setShowAsAction(2);
                add.setOnMenuItemClickListener(new ym(0, uobVar, this));
                i2 = i5;
            } else if (mobVar instanceof cpb) {
                if (Build.VERSION.SDK_INT >= 28) {
                    cpb cpbVar = (cpb) mobVar;
                    ru.c(menu, i2, this.d.getContext(), cpbVar.b, cpbVar.c, cpbVar.d);
                    i2++;
                }
            } else if (mobVar instanceof zob) {
                i3++;
            }
        }
        return true;
    }
}
