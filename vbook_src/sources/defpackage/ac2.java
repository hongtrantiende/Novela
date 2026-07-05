package defpackage;

import android.app.Activity;
import android.content.Context;
import android.credentials.CredentialManager;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ac2  reason: default package */
/* loaded from: classes.dex */
public final class ac2 implements sb2 {
    public final CredentialManager a;

    public ac2(Activity activity) {
        this.a = (CredentialManager) activity.getSystemService("credential");
    }

    @Override // defpackage.sb2
    public final boolean isAvailableOnDevice() {
        if (Build.VERSION.SDK_INT >= 34 && this.a != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.sb2
    public final void onGetCredential(Context context, qx4 qx4Var, CancellationSignal cancellationSignal, Executor executor, rb2 rb2Var) {
        uwd uwdVar = (uwd) rb2Var;
        ik ikVar = new ik(uwdVar, 7);
        CredentialManager credentialManager = this.a;
        if (credentialManager == null) {
            ikVar.invoke();
            return;
        }
        zb2 zb2Var = new zb2(uwdVar, this);
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        GetCredentialRequest.Builder builder = new GetCredentialRequest.Builder(bundle);
        for (ay4 ay4Var : qx4Var.a) {
            ay4Var.getClass();
            builder.addCredentialOption(new CredentialOption.Builder("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", ay4Var.a, ay4Var.b).setIsSystemProviderRequired(true).setAllowedProviders(ay4Var.c).build());
        }
        GetCredentialRequest build = builder.build();
        build.getClass();
        credentialManager.getCredential(context, build, cancellationSignal, executor, zb2Var);
    }
}
