package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;
import java.lang.reflect.Modifier;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class SignInHubActivity extends ur4 {
    public static boolean b0 = false;
    public boolean W = false;
    public SignInConfiguration X;
    public boolean Y;
    public int Z;
    public Intent a0;

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // defpackage.ur4, defpackage.bu1, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (!this.W) {
            setResult(0);
            if (i != 40962) {
                return;
            }
            if (intent != null) {
                SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                if (signInAccount != null && (googleSignInAccount = signInAccount.b) != null) {
                    uwd C = uwd.C(this);
                    GoogleSignInOptions googleSignInOptions = this.X.b;
                    synchronized (C) {
                        ((o0b) C.b).c(googleSignInAccount, googleSignInOptions);
                    }
                    intent.removeExtra("signInAccount");
                    intent.putExtra("googleSignInAccount", googleSignInAccount);
                    this.Y = true;
                    this.Z = i2;
                    this.a0 = intent;
                    p();
                    return;
                } else if (intent.hasExtra("errorCode")) {
                    int intExtra = intent.getIntExtra("errorCode", 8);
                    if (intExtra == 13) {
                        intExtra = 12501;
                    }
                    q(intExtra);
                    return;
                }
            }
            q(8);
        }
    }

    @Override // defpackage.ur4, defpackage.bu1, defpackage.au1, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            Log.e("AuthSignInClient", "Null action");
            q(12500);
        } else if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            Log.e("AuthSignInClient", "Action not implemented");
            q(12500);
        } else if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
        } else {
            Bundle bundleExtra = intent.getBundleExtra("config");
            if (bundleExtra == null) {
                Log.e("AuthSignInClient", "Activity started with no configuration.");
                setResult(0);
                finish();
                return;
            }
            SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
            if (signInConfiguration == null) {
                Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                setResult(0);
                finish();
                return;
            }
            this.X = signInConfiguration;
            if (bundle == null) {
                if (b0) {
                    setResult(0);
                    q(12502);
                    return;
                }
                b0 = true;
                Intent intent2 = new Intent(action);
                if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                    intent2.setPackage("com.google.android.gms");
                } else {
                    intent2.setPackage(getPackageName());
                }
                intent2.putExtra("config", this.X);
                try {
                    startActivityForResult(intent2, 40962);
                    return;
                } catch (ActivityNotFoundException unused) {
                    this.W = true;
                    Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                    q(17);
                    return;
                }
            }
            boolean z = bundle.getBoolean("signingInGoogleApiClients");
            this.Y = z;
            if (z) {
                this.Z = bundle.getInt("signInResultCode");
                Intent intent3 = (Intent) bundle.getParcelable("signInResultData");
                if (intent3 == null) {
                    Log.e("AuthSignInClient", "Sign in result data cannot be null");
                    setResult(0);
                    finish();
                    return;
                }
                this.a0 = intent3;
                p();
            }
        }
    }

    @Override // defpackage.ur4, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        b0 = false;
    }

    @Override // defpackage.bu1, defpackage.au1, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.Y);
        if (this.Y) {
            bundle.putInt("signInResultCode", this.Z);
            bundle.putParcelable("signInResultData", this.a0);
        }
    }

    public final void p() {
        qdd i = i();
        xy2 xy2Var = ls6.d;
        i.getClass();
        ob2 ob2Var = ob2.b;
        ob2Var.getClass();
        odd oddVar = new odd(i, xy2Var, ob2Var);
        gi1 a = cm9.a(ls6.class);
        String f = a.f();
        if (f != null) {
            ls6 ls6Var = (ls6) oddVar.a(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f));
            l97 l97Var = new l97(this);
            boolean z = ls6Var.c;
            bwa bwaVar = ls6Var.b;
            if (!z) {
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    ks6 ks6Var = (ks6) bwaVar.b(0);
                    if (ks6Var == null) {
                        try {
                            ls6Var.c = true;
                            Set set = qud.b;
                            synchronized (set) {
                            }
                            awd awdVar = new awd(this, set);
                            if (awd.class.isMemberClass() && !Modifier.isStatic(awd.class.getModifiers())) {
                                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + awdVar);
                            }
                            ks6 ks6Var2 = new ks6(awdVar);
                            bwaVar.d(0, ks6Var2);
                            ls6Var.c = false;
                            ih1 ih1Var = new ih1(ks6Var2.l, l97Var);
                            ks6Var2.d(this, ih1Var);
                            ih1 ih1Var2 = ks6Var2.n;
                            if (ih1Var2 != null) {
                                ks6Var2.h(ih1Var2);
                            }
                            ks6Var2.m = this;
                            ks6Var2.n = ih1Var;
                        } catch (Throwable th) {
                            ls6Var.c = false;
                            throw th;
                        }
                    } else {
                        ih1 ih1Var3 = new ih1(ks6Var.l, l97Var);
                        ks6Var.d(this, ih1Var3);
                        ih1 ih1Var4 = ks6Var.n;
                        if (ih1Var4 != null) {
                            ks6Var.h(ih1Var4);
                        }
                        ks6Var.m = this;
                        ks6Var.n = ih1Var3;
                    }
                    b0 = false;
                    return;
                }
                vs.k("initLoader must be called on the main thread");
                return;
            }
            vs.k("Called while creating a loader");
            return;
        }
        vs.m("Local and anonymous classes can not be ViewModels");
    }

    public final void q(int i) {
        Status status = new Status(i, null, null, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        b0 = false;
    }
}
