package defpackage;

import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.ResultReceiver;
import androidx.credentials.playservices.HiddenActivity;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b65  reason: default package */
/* loaded from: classes.dex */
public final class b65 extends fb6 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b65(Object obj, int i, int i2) {
        super(1);
        this.a = i2;
        this.b = obj;
        this.c = i;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                HiddenActivity hiddenActivity = (HiddenActivity) obj2;
                gk0 gk0Var = (gk0) obj;
                try {
                    hiddenActivity.b = true;
                    hiddenActivity.startIntentSenderForResult(gk0Var.a.getIntentSender(), this.c, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e) {
                    ResultReceiver resultReceiver = hiddenActivity.a;
                    resultReceiver.getClass();
                    hiddenActivity.a(resultReceiver, "GET_UNKNOWN", "During begin sign in, one tap ui intent sender failure: " + e.getMessage());
                }
                return pvcVar;
            case 1:
                HiddenActivity hiddenActivity2 = (HiddenActivity) obj2;
                qx9 qx9Var = (qx9) obj;
                try {
                    hiddenActivity2.b = true;
                    hiddenActivity2.startIntentSenderForResult(qx9Var.a.getIntentSender(), this.c, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e2) {
                    ResultReceiver resultReceiver2 = hiddenActivity2.a;
                    resultReceiver2.getClass();
                    hiddenActivity2.a(resultReceiver2, "CREATE_UNKNOWN", "During save password, found UI intent sender failure: " + e2.getMessage());
                }
                return pvcVar;
            case 2:
                HiddenActivity hiddenActivity3 = (HiddenActivity) obj2;
                PendingIntent pendingIntent = (PendingIntent) obj;
                pendingIntent.getClass();
                try {
                    hiddenActivity3.b = true;
                    hiddenActivity3.startIntentSenderForResult(pendingIntent.getIntentSender(), this.c, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e3) {
                    ResultReceiver resultReceiver3 = hiddenActivity3.a;
                    resultReceiver3.getClass();
                    hiddenActivity3.a(resultReceiver3, "CREATE_UNKNOWN", "During public key credential, found IntentSender failure on public key creation: " + e3.getMessage());
                }
                return pvcVar;
            case 3:
                HiddenActivity hiddenActivity4 = (HiddenActivity) obj2;
                PendingIntent pendingIntent2 = (PendingIntent) obj;
                try {
                    hiddenActivity4.b = true;
                    hiddenActivity4.startIntentSenderForResult(pendingIntent2.getIntentSender(), this.c, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e4) {
                    ResultReceiver resultReceiver4 = hiddenActivity4.a;
                    resultReceiver4.getClass();
                    hiddenActivity4.a(resultReceiver4, "GET_UNKNOWN", "During get sign-in intent, one tap ui intent sender failure: " + e4.getMessage());
                }
                return pvcVar;
            default:
                Boolean valueOf = Boolean.valueOf(((hn4) obj).O1(this.c));
                ((zl9) obj2).a = valueOf;
                return valueOf;
        }
    }
}
