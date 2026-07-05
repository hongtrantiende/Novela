package defpackage;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jud  reason: default package */
/* loaded from: classes.dex */
public final class jud extends mn6 implements DialogInterface.OnCancelListener {
    public volatile boolean a;
    public final AtomicReference b;
    public final ovd c;
    public final uz4 d;
    public final a00 e;
    public final yz4 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jud(sn6 sn6Var, yz4 yz4Var) {
        super(sn6Var);
        uz4 uz4Var = uz4.e;
        this.b = new AtomicReference(null);
        this.c = new ovd(Looper.getMainLooper(), 0);
        this.d = uz4Var;
        this.e = new a00(0);
        this.f = yz4Var;
        this.mLifecycleFragment.a("ConnectionlessLifecycleHelper", this);
    }

    @Override // defpackage.mn6
    public final void onActivityResult(int i, int i2, Intent intent) {
        AtomicReference atomicReference = this.b;
        nvd nvdVar = (nvd) atomicReference.get();
        yz4 yz4Var = this.f;
        if (i != 1) {
            if (i == 2) {
                int c = this.d.c(getActivity(), vz4.a);
                if (c == 0) {
                    atomicReference.set(null);
                    ovd ovdVar = yz4Var.J;
                    ovdVar.sendMessage(ovdVar.obtainMessage(3));
                    return;
                } else if (nvdVar != null) {
                    if (nvdVar.b.b == 18 && c == 18) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else if (i2 == -1) {
            atomicReference.set(null);
            ovd ovdVar2 = yz4Var.J;
            ovdVar2.sendMessage(ovdVar2.obtainMessage(3));
            return;
        } else if (i2 == 0) {
            if (nvdVar != null) {
                int i3 = 13;
                if (intent != null) {
                    i3 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                jz1 jz1Var = new jz1(i3, null, nvdVar.b.toString());
                int i4 = nvdVar.a;
                atomicReference.set(null);
                yz4Var.h(jz1Var, i4);
                return;
            }
            return;
        }
        if (nvdVar != null) {
            jz1 jz1Var2 = nvdVar.b;
            int i5 = nvdVar.a;
            atomicReference.set(null);
            yz4Var.h(jz1Var2, i5);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i;
        jz1 jz1Var = new jz1(13, null, null);
        AtomicReference atomicReference = this.b;
        nvd nvdVar = (nvd) atomicReference.get();
        if (nvdVar == null) {
            i = -1;
        } else {
            i = nvdVar.a;
        }
        atomicReference.set(null);
        this.f.h(jz1Var, i);
    }

    @Override // defpackage.mn6
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            nvd nvdVar = null;
            if (bundle.getBoolean("resolving_error", false)) {
                nvdVar = new nvd(new jz1(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution"), null), bundle.getInt("failed_client_id", -1));
            }
            this.b.set(nvdVar);
        }
    }

    @Override // defpackage.mn6
    public final void onResume() {
        super.onResume();
        if (!this.e.isEmpty()) {
            this.f.e(this);
        }
    }

    @Override // defpackage.mn6
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        nvd nvdVar = (nvd) this.b.get();
        if (nvdVar == null) {
            return;
        }
        jz1 jz1Var = nvdVar.b;
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", nvdVar.a);
        bundle.putInt("failed_status", jz1Var.b);
        bundle.putParcelable("failed_resolution", jz1Var.c);
    }

    @Override // defpackage.mn6
    public final void onStart() {
        super.onStart();
        this.a = true;
        if (!this.e.isEmpty()) {
            this.f.e(this);
        }
    }

    @Override // defpackage.mn6
    public final void onStop() {
        this.a = false;
        yz4 yz4Var = this.f;
        yz4Var.getClass();
        synchronized (yz4.N) {
            try {
                if (yz4Var.G == this) {
                    yz4Var.G = null;
                    yz4Var.H.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
