package androidx.credentials.provider;

import android.os.CancellationSignal;
import android.os.OutcomeReceiver;
import android.service.credentials.BeginCreateCredentialRequest;
import android.service.credentials.BeginGetCredentialRequest;
import android.service.credentials.ClearCredentialStateRequest;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public abstract class CredentialProviderService extends android.service.credentials.CredentialProviderService {
    public abstract void a();

    public abstract void b();

    public abstract void c();

    public final void onBeginCreateCredential(BeginCreateCredentialRequest beginCreateCredentialRequest, CancellationSignal cancellationSignal, OutcomeReceiver outcomeReceiver) {
        beginCreateCredentialRequest.getClass();
        cancellationSignal.getClass();
        outcomeReceiver.getClass();
        k4.c(beginCreateCredentialRequest);
        a();
    }

    public final void onBeginGetCredential(BeginGetCredentialRequest beginGetCredentialRequest, CancellationSignal cancellationSignal, OutcomeReceiver outcomeReceiver) {
        beginGetCredentialRequest.getClass();
        cancellationSignal.getClass();
        outcomeReceiver.getClass();
        k4.d(beginGetCredentialRequest);
        b();
    }

    public final void onClearCredentialState(ClearCredentialStateRequest clearCredentialStateRequest, CancellationSignal cancellationSignal, OutcomeReceiver outcomeReceiver) {
        clearCredentialStateRequest.getClass();
        cancellationSignal.getClass();
        outcomeReceiver.getClass();
        k4.e(clearCredentialStateRequest);
        c();
    }
}
