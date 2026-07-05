package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nr6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class nr6 implements Handler.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nr6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                rr6 rr6Var = (rr6) obj;
                pr6 pr6Var = rr6Var.c;
                pr6Var.getClass();
                Iterator it = rr6Var.d.iterator();
                while (it.hasNext()) {
                    qr6 qr6Var = (qr6) it.next();
                    if (!qr6Var.d && qr6Var.c) {
                        ci4 c = qr6Var.b.c();
                        qr6Var.b = new ih1(3);
                        qr6Var.c = false;
                        pr6Var.b(qr6Var.a, c);
                    }
                    ggb ggbVar = rr6Var.b;
                    ggbVar.getClass();
                    if (ggbVar.a.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            default:
                kn knVar = (kn) obj;
                int i2 = message.what;
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                return false;
                            }
                            ((f5b) knVar.G).a();
                        } else {
                            ((e5b) knVar.F).a();
                        }
                    } else {
                        ((d5b) knVar.E).a();
                    }
                } else {
                    ((c5b) knVar.D).a();
                }
                return true;
        }
    }
}
