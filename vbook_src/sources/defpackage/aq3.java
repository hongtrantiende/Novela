package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: aq3  reason: default package */
/* loaded from: classes.dex */
public final class aq3 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final int b;
    public final Object c;

    public aq3(List list, int i, Throwable th) {
        jsc.w(list, "initCallbacks cannot be null");
        this.c = new ArrayList(list);
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i3 = 0;
                if (i2 != 1) {
                    while (i3 < size) {
                        ((zp3) arrayList.get(i3)).a();
                        i3++;
                    }
                    return;
                }
                while (i3 < size) {
                    ((zp3) arrayList.get(i3)).b();
                    i3++;
                }
                return;
            default:
                ((oud) obj).c(i2);
                return;
        }
    }

    public aq3(oud oudVar, int i) {
        this.b = i;
        this.c = oudVar;
    }
}
