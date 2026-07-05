package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dxd  reason: default package */
/* loaded from: classes.dex */
public final class dxd extends Fragment implements sn6 {
    public static final WeakHashMap b = new WeakHashMap();
    public final kj a = new kj(18, false);

    @Override // defpackage.sn6
    public final void a(String str, mn6 mn6Var) {
        this.a.C(str, mn6Var);
    }

    @Override // defpackage.sn6
    public final mn6 c(Class cls, String str) {
        return (mn6) cls.cast(((Map) this.a.b).get(str));
    }

    @Override // defpackage.sn6
    public final Activity d() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (mn6 mn6Var : ((Map) this.a.b).values()) {
            mn6Var.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (mn6 mn6Var : ((Map) this.a.b).values()) {
            mn6Var.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a.D(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        kj kjVar = this.a;
        kjVar.a = 5;
        for (mn6 mn6Var : ((Map) kjVar.b).values()) {
            mn6Var.onDestroy();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        kj kjVar = this.a;
        kjVar.a = 3;
        for (mn6 mn6Var : ((Map) kjVar.b).values()) {
            mn6Var.onResume();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.a.F(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        kj kjVar = this.a;
        kjVar.a = 2;
        for (mn6 mn6Var : ((Map) kjVar.b).values()) {
            mn6Var.onStart();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        kj kjVar = this.a;
        kjVar.a = 4;
        for (mn6 mn6Var : ((Map) kjVar.b).values()) {
            mn6Var.onStop();
        }
    }
}
