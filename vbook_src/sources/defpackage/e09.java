package defpackage;

import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e09  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class e09 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e09(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        View findFocus;
        kld kldVar;
        int i = this.a;
        Boolean bool = null;
        Map map = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((j09) obj).invalidate();
                return;
            case 1:
                r69 r69Var = (r69) obj;
                xn6 xn6Var = r69Var.f;
                if (r69Var.b == 0) {
                    r69Var.c = true;
                    xn6Var.d(jn6.ON_PAUSE);
                }
                if (r69Var.a == 0 && r69Var.c) {
                    xn6Var.d(jn6.ON_STOP);
                    r69Var.d = true;
                    return;
                }
                return;
            case 2:
                ht9.a((ht9) obj);
                return;
            case 3:
                bm1 bm1Var = (bm1) obj;
                synchronized (((ArrayDeque) bm1Var.e)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) bm1Var.b).edit();
                    String str = (String) bm1Var.c;
                    StringBuilder sb = new StringBuilder();
                    Iterator it = ((ArrayDeque) bm1Var.e).iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append((String) bm1Var.d);
                    }
                    edit.putString(str, sb.toString()).apply();
                }
                return;
            case 4:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) ((xk9) obj).b;
                int i2 = sideSheetBehavior.n;
                if (i2 == 2 && i2 != 0) {
                    sideSheetBehavior.n = 0;
                    return;
                }
                return;
            case 5:
                View view = (View) obj;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            case 6:
                nwa nwaVar = (nwa) obj;
                Surface surface = nwaVar.D;
                if (surface != null) {
                    Iterator it2 = nwaVar.a.iterator();
                    while (it2.hasNext()) {
                        ((c04) it2.next()).a.Q(null);
                    }
                }
                SurfaceTexture surfaceTexture = nwaVar.C;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                nwaVar.C = null;
                nwaVar.D = null;
                return;
            case 7:
                vub vubVar = (vub) obj;
                zg4 zg4Var = vubVar.b;
                vubVar.n = null;
                gw7 gw7Var = vubVar.m;
                View view2 = vubVar.a;
                if (!view2.isFocused() && (findFocus = view2.getRootView().findFocus()) != null && findFocus.onCheckIsTextEditor()) {
                    gw7Var.g();
                    return;
                }
                Object[] objArr = gw7Var.a;
                int i3 = gw7Var.c;
                Boolean bool2 = null;
                for (int i4 = 0; i4 < i3; i4++) {
                    uub uubVar = (uub) objArr[i4];
                    int ordinal = uubVar.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2 && ordinal != 3) {
                                xk5.o();
                                return;
                            }
                            if (!c16.i(bool, Boolean.FALSE)) {
                                if (uubVar == uub.c) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                bool2 = Boolean.valueOf(z);
                            }
                        } else {
                            bool = Boolean.FALSE;
                        }
                    } else {
                        bool = Boolean.TRUE;
                    }
                    bool2 = bool;
                }
                gw7Var.g();
                if (c16.i(bool, Boolean.TRUE)) {
                    ((InputMethodManager) ((ye6) zg4Var.c).getValue()).restartInput((View) zg4Var.b);
                }
                if (bool2 != null) {
                    if (bool2.booleanValue()) {
                        ((xk9) ((bp9) zg4Var.d).b).r();
                    } else {
                        ((xk9) ((bp9) zg4Var.d).b).h();
                    }
                }
                if (c16.i(bool, Boolean.FALSE)) {
                    ((InputMethodManager) ((ye6) zg4Var.c).getValue()).restartInput((View) zg4Var.b);
                    return;
                }
                return;
            case 8:
                o40 o40Var = (o40) obj;
                ((AtomicReference) o40Var.c).set(null);
                synchronized (o40Var) {
                    if (((AtomicMarkableReference) o40Var.b).isMarked()) {
                        k96 k96Var = (k96) ((AtomicMarkableReference) o40Var.b).getReference();
                        synchronized (k96Var) {
                            map = Collections.unmodifiableMap(new HashMap(k96Var.a));
                        }
                        AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) o40Var.b;
                        atomicMarkableReference.set((k96) atomicMarkableReference.getReference(), false);
                    }
                }
                if (map != null) {
                    oe4 oe4Var = (oe4) o40Var.d;
                    ((qb7) oe4Var.c).h((String) oe4Var.b, map, o40Var.a);
                    return;
                }
                return;
            case 9:
                r12.a.postVsyncCallback((u8d) obj);
                return;
            case 10:
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + kldVar.a.getAction() + " finishing.");
                ((kld) obj).b.trySetResult(null);
                return;
            default:
                odd oddVar = (odd) obj;
                ((hw9) oddVar.e).S(new d89(oddVar, 17));
                return;
        }
    }
}
