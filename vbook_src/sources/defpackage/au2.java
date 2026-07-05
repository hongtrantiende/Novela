package defpackage;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: au2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class au2 implements hu1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mf9 b;

    public /* synthetic */ au2(mf9 mf9Var, int i) {
        this.a = i;
        this.b = mf9Var;
    }

    @Override // defpackage.hu1
    public final Object j(yv yvVar) {
        int i = this.a;
        mf9 mf9Var = this.b;
        switch (i) {
            case 0:
                return new cu2((Context) yvVar.a(Context.class), ((qf4) yvVar.a(qf4.class)).f(), yvVar.b(mf9.a(j55.class)), yvVar.c(ty2.class), (Executor) yvVar.h(mf9Var));
            default:
                return FirebaseMessagingRegistrar.a(mf9Var, yvVar);
        }
    }
}
