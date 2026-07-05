package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yt1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class yt1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yt1(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = i;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a6 a6Var;
        int i = this.a;
        Object obj = this.d;
        int i2 = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                zt1 zt1Var = (zt1) obj2;
                Serializable serializable = (Serializable) ((uwd) obj).b;
                String str = (String) zt1Var.a.get(Integer.valueOf(i2));
                if (str != null) {
                    m6 m6Var = (m6) zt1Var.e.get(str);
                    if (m6Var != null) {
                        a6Var = m6Var.a;
                    } else {
                        a6Var = null;
                    }
                    if (a6Var == null) {
                        zt1Var.g.remove(str);
                        zt1Var.f.put(str, serializable);
                        return;
                    }
                    a6 a6Var2 = m6Var.a;
                    if (zt1Var.d.remove(str)) {
                        a6Var2.e(serializable);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((zt1) obj2).a(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                return;
            case 2:
                ((z69) ((n53) obj2).c).l(i2, obj);
                return;
            default:
                or6 or6Var = (or6) obj;
                Iterator it = ((CopyOnWriteArraySet) obj2).iterator();
                while (it.hasNext()) {
                    qr6 qr6Var = (qr6) it.next();
                    if (!qr6Var.d) {
                        if (i2 != -1) {
                            qr6Var.b.b(i2);
                        }
                        qr6Var.c = true;
                        or6Var.invoke(qr6Var.a);
                    }
                }
                return;
        }
    }
}
