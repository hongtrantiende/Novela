package defpackage;

import com.google.firebase.messaging.FirebaseMessaging;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qg4  reason: default package */
/* loaded from: classes3.dex */
public final class qg4 {
    public final FirebaseMessaging a;

    public qg4(FirebaseMessaging firebaseMessaging) {
        this.a = firebaseMessaging;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.n42 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.pg4
            if (r0 == 0) goto L13
            r0 = r6
            pg4 r0 = (defpackage.pg4) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            pg4 r0 = new pg4
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r6)
            goto L67
        L25:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            r5 = 0
            return r5
        L2c:
            defpackage.hre.r(r6)
            com.google.firebase.messaging.FirebaseMessaging r5 = r5.a
            bm1 r6 = r5.d
            boolean r6 = r6.J()
            if (r6 == 0) goto L45
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "API disabled. Please use {@link #register()} instead or enable this API by removing {@code <meta-data android:name=\"firebase_messaging_installation_id_enabled\" android:value=\"true\" />} from your app's manifest."
            r5.<init>(r6)
            com.google.android.gms.tasks.Task r5 = com.google.android.gms.tasks.Tasks.forException(r5)
            goto L59
        L45:
            com.google.android.gms.tasks.TaskCompletionSource r6 = new com.google.android.gms.tasks.TaskCompletionSource
            r6.<init>()
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r5.g
            ex2 r3 = new ex2
            r4 = 5
            r3.<init>(r4, r5, r6)
            r1.execute(r3)
            com.google.android.gms.tasks.Task r5 = r6.getTask()
        L59:
            r5.getClass()
            r0.c = r2
            java.lang.Object r6 = defpackage.kve.a(r5, r0)
            n82 r5 = defpackage.n82.a
            if (r6 != r5) goto L67
            return r5
        L67:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qg4.a(n42):java.lang.Object");
    }
}
