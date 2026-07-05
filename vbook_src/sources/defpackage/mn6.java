package defpackage;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mn6  reason: default package */
/* loaded from: classes.dex */
public abstract class mn6 {
    protected final sn6 mLifecycleFragment;

    public mn6(sn6 sn6Var) {
        this.mLifecycleFragment = sn6Var;
    }

    public static sn6 getFragment(ln6 ln6Var) {
        dxd dxdVar;
        nge ngeVar;
        Activity activity = ln6Var.a;
        if (activity instanceof ur4) {
            ur4 ur4Var = (ur4) activity;
            WeakHashMap weakHashMap = nge.r0;
            hs4 hs4Var = ((tr4) ur4Var.R.a).f;
            WeakHashMap weakHashMap2 = nge.r0;
            WeakReference weakReference = (WeakReference) weakHashMap2.get(ur4Var);
            if (weakReference != null && (ngeVar = (nge) weakReference.get()) != null) {
                return ngeVar;
            }
            try {
                nge ngeVar2 = (nge) hs4Var.D("SLifecycleFragmentImpl");
                if (ngeVar2 == null || ngeVar2.H) {
                    ngeVar2 = new nge();
                    uf0 uf0Var = new uf0(hs4Var);
                    uf0Var.f(0, ngeVar2, "SLifecycleFragmentImpl");
                    uf0Var.e(true, true);
                }
                weakHashMap2.put(ur4Var, new WeakReference(ngeVar2));
                return ngeVar2;
            } catch (ClassCastException e) {
                throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
            }
        } else if (activity != null) {
            WeakHashMap weakHashMap3 = dxd.b;
            WeakReference weakReference2 = (WeakReference) weakHashMap3.get(activity);
            if (weakReference2 != null && (dxdVar = (dxd) weakReference2.get()) != null) {
                return dxdVar;
            }
            try {
                dxd dxdVar2 = (dxd) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (dxdVar2 == null || dxdVar2.isRemoving()) {
                    dxdVar2 = new dxd();
                    activity.getFragmentManager().beginTransaction().add(dxdVar2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                weakHashMap3.put(activity, new WeakReference(dxdVar2));
                return dxdVar2;
            } catch (ClassCastException e2) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e2);
            }
        } else {
            vs.m("Can't get fragment for unexpected activity.");
            return null;
        }
    }

    public Activity getActivity() {
        Activity d = this.mLifecycleFragment.d();
        am8.s(d);
        return d;
    }

    public abstract void onStop();

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onStart() {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public static sn6 getFragment(Activity activity) {
        return getFragment(new ln6(activity));
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public static sn6 getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }
}
