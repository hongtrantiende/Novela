package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bbf  reason: default package */
/* loaded from: classes.dex */
public final class bbf implements z8f, x00, Continuation {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;

    public /* synthetic */ bbf(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.x00
    public ListenableFuture call() {
        qgf c = kff.c();
        sgf b = kff.b(c, (sgf) this.b);
        try {
            ListenableFuture call = ((x00) this.c).call();
            kff.b(c, b);
            call.getClass();
            return call;
        } finally {
        }
    }

    @Override // defpackage.z8f
    public Object d(x8f x8fVar) {
        Uri uri = x8fVar.d;
        AtomicLong atomicLong = xaf.a;
        int myPid = Process.myPid();
        long id = Thread.currentThread().getId();
        long currentTimeMillis = System.currentTimeMillis();
        long andIncrement = xaf.a.getAndIncrement();
        int length = String.valueOf(myPid).length();
        int length2 = String.valueOf(id).length();
        StringBuilder sb = new StringBuilder(length + 15 + length2 + 1 + String.valueOf(currentTimeMillis).length() + 1 + String.valueOf(andIncrement).length());
        sb.append(".mobstore_tmp-");
        sb.append(myPid);
        sb.append("-");
        sb.append(id);
        rs8.x(sb, "-", currentTimeMillis, "-");
        sb.append(andIncrement);
        Uri build = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(sb.toString())).build();
        ebf ebfVar = x8fVar.a;
        ArrayList a = x8fVar.a(ebfVar.d(build));
        rwa[] rwaVarArr = (rwa[]) this.c;
        if (rwaVarArr != null) {
            rwaVarArr[0].A(a);
        }
        try {
            OutputStream outputStream = (OutputStream) a.get(0);
            ((hzd) this.b).b(outputStream);
            rwa[] rwaVarArr2 = (rwa[]) this.c;
            if (rwaVarArr2 != null) {
                rwa rwaVar = rwaVarArr2[0];
                if (((haf) rwaVar.c) != null) {
                    ((OutputStream) rwaVar.b).flush();
                    ((haf) rwaVar.c).a.getFD().sync();
                } else {
                    throw new IOException("Cannot sync underlying stream");
                }
            }
            outputStream.close();
            ebfVar.f(build, uri);
            return null;
        } catch (Exception e) {
            try {
                ebfVar.e(build);
            } catch (FileNotFoundException unused) {
            }
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            throw new IOException(e);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        kv9 kv9Var = (kv9) this.b;
        Bundle bundle = (Bundle) this.c;
        kv9Var.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        if (bundle2 != null && bundle2.containsKey("google.messenger")) {
            return kv9Var.b(bundle).onSuccessTask(f73.c, d38.b);
        }
        return task;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                x00 x00Var = (x00) this.c;
                StringBuilder sb = new StringBuilder(x00Var.toString().length() + 14);
                sb.append("propagating=[");
                sb.append(x00Var);
                sb.append("]");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public bbf(hzd hzdVar) {
        this.a = 0;
        this.b = hzdVar;
    }
}
