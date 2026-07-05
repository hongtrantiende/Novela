package defpackage;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ng4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ng4 implements OnSuccessListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FirebaseMessaging b;

    public /* synthetic */ ng4(FirebaseMessaging firebaseMessaging, int i) {
        this.a = i;
        this.b = firebaseMessaging;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        int i = this.a;
        FirebaseMessaging firebaseMessaging = this.b;
        switch (i) {
            case 0:
                fic ficVar = (fic) obj;
                if (firebaseMessaging.f.g()) {
                    ficVar.c();
                    return;
                }
                return;
            default:
                nk1 nk1Var = (nk1) obj;
                if (nk1Var != null) {
                    hif.r(nk1Var.a);
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
