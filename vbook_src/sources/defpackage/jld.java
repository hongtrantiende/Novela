package defpackage;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.EnhancedIntentService;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jld  reason: default package */
/* loaded from: classes.dex */
public final class jld extends Binder {
    public final uwd a;

    public jld(uwd uwdVar) {
        this.a = uwdVar;
    }

    public final void a(kld kldVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            Intent intent = kldVar.a;
            EnhancedIntentService enhancedIntentService = (EnhancedIntentService) this.a.b;
            int i = EnhancedIntentService.f;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            enhancedIntentService.a.execute(new bn(4, enhancedIntentService, intent, taskCompletionSource));
            taskCompletionSource.getTask().addOnCompleteListener(new az(1), new d89(kldVar, 14));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
