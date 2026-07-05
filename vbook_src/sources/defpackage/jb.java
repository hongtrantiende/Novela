package defpackage;

import android.os.Build;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jb  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jb implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ jb(cw cwVar, int i) {
        this.a = 3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i = AlarmManagerSchedulerBroadcastReceiver.a;
                return;
            case 1:
                kv7 kv7Var = rg.i1;
                synchronized (kv7Var) {
                    try {
                        int i2 = Build.VERSION.SDK_INT;
                        Object[] objArr = kv7Var.a;
                        int i3 = kv7Var.b;
                        int i4 = 0;
                        if (i2 < 30) {
                            while (i4 < i3) {
                                rg rgVar = (rg) objArr[i4];
                                boolean showLayoutBounds = rgVar.getShowLayoutBounds();
                                abf abfVar = rg.e1;
                                rgVar.setShowLayoutBounds(abf.t());
                                if (showLayoutBounds != rgVar.getShowLayoutBounds()) {
                                    rgVar.post(new ag(rgVar, 2));
                                }
                                i4++;
                            }
                        } else {
                            while (i4 < i3) {
                                rg rgVar2 = (rg) objArr[i4];
                                rgVar2.post(new ag(rgVar2, 3));
                                i4++;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 2:
            default:
                return;
        }
    }

    public /* synthetic */ jb(int i) {
        this.a = i;
    }

    private final void a() {
    }

    private final void b() {
    }
}
