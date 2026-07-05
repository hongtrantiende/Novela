package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e8f  reason: default package */
/* loaded from: classes.dex */
public final class e8f {
    public final int a;
    public final TaskCompletionSource b = new TaskCompletionSource();
    public final int c;
    public final Bundle d;
    public final /* synthetic */ int e;

    public e8f(int i, int i2, Bundle bundle, int i3) {
        this.e = i3;
        this.a = i;
        this.c = i2;
        this.d = bundle;
    }

    public final boolean a() {
        switch (this.e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String e8fVar = toString();
            String valueOf = String.valueOf(bundle);
            Log.d("MessengerIpcClient", nk2.w(new StringBuilder(e8fVar.length() + 16 + valueOf.length()), "Finishing ", e8fVar, " with ", valueOf));
        }
        this.b.setResult(bundle);
    }

    public final void c(e60 e60Var) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String e8fVar = toString();
            String obj = e60Var.toString();
            Log.d("MessengerIpcClient", nk2.w(new StringBuilder(e8fVar.length() + 14 + obj.length()), "Failing ", e8fVar, " with ", obj));
        }
        this.b.setException(e60Var);
    }

    public final String toString() {
        int i = this.c;
        int length = String.valueOf(i).length();
        int i2 = this.a;
        int length2 = String.valueOf(i2).length();
        boolean a = a();
        StringBuilder sb = new StringBuilder(length + 19 + length2 + 8 + String.valueOf(a).length() + 1);
        a82.t(i, i2, "Request { what=", " id=", sb);
        sb.append(" oneWay=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
