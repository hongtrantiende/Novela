package defpackage;

import android.content.Context;
import android.os.Build;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ojc  reason: default package */
/* loaded from: classes.dex */
public final class ojc {
    public final Context a;
    public final m02 b;
    public final vj0 c;
    public final b28 d;
    public final m02 e;

    public ojc(Context context, omd omdVar) {
        b28 b28Var;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        vj0 vj0Var = new vj0(applicationContext, omdVar, 0);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        vj0 vj0Var2 = new vj0(applicationContext2, omdVar, 1);
        if (Build.VERSION.SDK_INT < 28) {
            Context applicationContext3 = context.getApplicationContext();
            applicationContext3.getClass();
            String str = a28.a;
            b28Var = new b28(applicationContext3, omdVar);
        } else {
            b28Var = null;
        }
        Context applicationContext4 = context.getApplicationContext();
        applicationContext4.getClass();
        vj0 vj0Var3 = new vj0(applicationContext4, omdVar, 2);
        this.a = context;
        this.b = vj0Var;
        this.c = vj0Var2;
        this.d = b28Var;
        this.e = vj0Var3;
    }
}
