package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gtd  reason: default package */
/* loaded from: classes.dex */
public final class gtd extends cud {
    public final /* synthetic */ IBinder C;
    public final /* synthetic */ itd D;

    public gtd(itd itdVar, IBinder iBinder) {
        this.D = itdVar;
        this.C = iBinder;
    }

    @Override // defpackage.cud
    public final void b() {
        jtd jtdVar = this.D.a;
        jtdVar.n = (IInterface) jtdVar.i.a(this.C);
        bud budVar = jtdVar.b;
        int i = 0;
        budVar.b("linkToDeath", new Object[0]);
        try {
            jtdVar.n.asBinder().linkToDeath(jtdVar.k, 0);
        } catch (RemoteException e) {
            budVar.a(e, "linkToDeath failed", new Object[0]);
        }
        jtdVar.g = false;
        ArrayList arrayList = jtdVar.d;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Runnable) obj).run();
        }
        jtdVar.d.clear();
    }
}
