package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import androidx.pdf.service.PdfDocumentServiceImpl;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lr8  reason: default package */
/* loaded from: classes.dex */
public final class lr8 implements kr8 {
    public final Context a;
    public final cza b;
    public final ConcurrentLinkedQueue c;
    public boolean d;

    public lr8(Context context) {
        context.getClass();
        this.a = context;
        this.b = dza.a(o73.a);
        this.c = new ConcurrentLinkedQueue();
    }

    public final Object a(Uri uri, n42 n42Var) {
        Context context = this.a;
        Intent intent = new Intent(context, PdfDocumentServiceImpl.class);
        StringBuilder sb = new StringBuilder();
        sb.append(uri);
        sb.append('_');
        sb.append(UUID.randomUUID());
        String sb2 = sb.toString();
        if (Build.VERSION.SDK_INT >= 29) {
            intent.setIdentifier(sb2);
        } else {
            intent.setData(Uri.parse("id://".concat(sb2)));
        }
        context.bindService(intent, this, 1);
        Object D = z1d.D(this.b, new bo0(2, 6, null), n42Var);
        if (D == n82.a) {
            return D;
        }
        return pvc.a;
    }

    public final void b() {
        Object value;
        cza czaVar = this.b;
        if (czaVar.getValue() instanceof dz1) {
            do {
                value = czaVar.getValue();
                rz1 rz1Var = (rz1) value;
            } while (!czaVar.l(value, o73.a));
            fp8 c = c();
            if (c != null) {
                c.E();
            }
            this.a.unbindService(this);
        }
    }

    public final fp8 c() {
        dz1 dz1Var;
        Object value = this.b.getValue();
        if (value instanceof dz1) {
            dz1Var = (dz1) value;
        } else {
            dz1Var = null;
        }
        if (dz1Var == null) {
            return null;
        }
        return dz1Var.a;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, dp8] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        fp8 fp8Var;
        cza czaVar;
        Object value;
        int i = ep8.a;
        if (iBinder == null) {
            fp8Var = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface(fp8.k);
            if (queryLocalInterface != null && (queryLocalInterface instanceof fp8)) {
                fp8Var = (fp8) queryLocalInterface;
            } else {
                ?? obj = new Object();
                obj.a = iBinder;
                fp8Var = obj;
            }
        }
        do {
            czaVar = this.b;
            value = czaVar.getValue();
            rz1 rz1Var = (rz1) value;
            fp8Var.getClass();
        } while (!czaVar.l(value, new dz1(fp8Var)));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        cza czaVar;
        Object value;
        this.d = true;
        do {
            czaVar = this.b;
            value = czaVar.getValue();
            rz1 rz1Var = (rz1) value;
        } while (!czaVar.l(value, o73.a));
        ConcurrentLinkedQueue concurrentLinkedQueue = this.c;
        if (concurrentLinkedQueue == null || !concurrentLinkedQueue.isEmpty()) {
            Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                if (((w26) it.next()).isActive()) {
                    return;
                }
            }
        }
        b();
    }
}
