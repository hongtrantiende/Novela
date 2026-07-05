package com.reader.android;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.vbook.android.R;
import java.lang.ref.WeakReference;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class MainActivity extends bu1 {
    public static final /* synthetic */ int V = 0;
    public final bm1 R = new bm1(cm9.a(uwa.class), new th9(this, 3), new th9(this, 2), new th9(this, 4));
    public final av2 S = new av2();
    public final ye6 T;
    public final ye6 U;

    public MainActivity() {
        th9 th9Var = new th9(this, 0);
        sk6 sk6Var = sk6.a;
        this.T = ipe.x(sk6Var, th9Var);
        this.U = ipe.x(sk6Var, new th9(this, 1));
    }

    public static void o(Intent intent) {
        String str;
        Uri data = intent.getData();
        String action = intent.getAction();
        kr2 kr2Var = kr2.a;
        lr2 lr2Var = lr2.a;
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != -1173264947) {
                if (hashCode == -1173171990 && action.equals("android.intent.action.VIEW")) {
                    if (data != null) {
                        xy0 xy0Var = yr2.a;
                        String uri = data.toString();
                        uri.getClass();
                        yr2.b(kr2Var, lr2Var, uri);
                        intent.setData(null);
                        return;
                    }
                    return;
                }
            } else if (action.equals("android.intent.action.SEND")) {
                String type = intent.getType();
                if (type != null && type.hashCode() == 817335912 && type.equals("text/plain")) {
                    xy0 xy0Var2 = yr2.a;
                    String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    yr2.b(kr2.b, lr2Var, stringExtra);
                    return;
                }
                return;
            }
        }
        if (data != null) {
            str = data.getScheme();
        } else {
            str = null;
        }
        if (c16.i(str, "vbookapp")) {
            xy0 xy0Var3 = yr2.a;
            String uri2 = data.toString();
            uri2.getClass();
            yr2.b(kr2Var, lr2Var, uri2);
            intent.setData(null);
        }
    }

    @Override // defpackage.au1, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z;
        keyEvent.getClass();
        av2 av2Var = this.S;
        av2Var.getClass();
        List<i86> u0 = sl1.u0(av2Var.a, new kn4(20));
        if (!u0.isEmpty()) {
            for (i86 i86Var : u0) {
                i86Var.getClass();
                if (((Boolean) i86Var.b.getValue()).booleanValue()) {
                    z = ((Boolean) ((xt4) i86Var.c.getValue()).invoke(new g86(keyEvent))).booleanValue();
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    return true;
                }
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.bu1, defpackage.au1, android.app.Activity
    public void onCreate(Bundle bundle) {
        rwa rwaVar;
        sw1 sw1Var;
        if (Build.VERSION.SDK_INT >= 31) {
            rwaVar = new qwa(this);
        } else {
            rwaVar = new rwa(this);
        }
        rwaVar.m();
        p(bundle);
        ye6 ye6Var = this.T;
        if (((zf) ye6Var.getValue()) != null) {
            zf zfVar = (zf) ye6Var.getValue();
            zfVar.getClass();
            this.a.a(new yf(0, zfVar, this));
            Context applicationContext = getApplicationContext();
            applicationContext.getClass();
            zfVar.c = applicationContext;
            zfVar.d = new di2(hh2.a(applicationContext), 1);
        }
        ((djb) this.U.getValue()).d();
        rwaVar.q(new d89(this, 1));
        Intent intent = getIntent();
        intent.getClass();
        o(intent);
        tu1 tu1Var = new tu1(new sh9(this, 0), true, 1121999615);
        ViewGroup.LayoutParams layoutParams = cu1.a;
        View childAt = ((ViewGroup) getWindow().getDecorView().findViewById(16908290)).getChildAt(0);
        if (childAt instanceof sw1) {
            sw1Var = (sw1) childAt;
        } else {
            sw1Var = null;
        }
        if (sw1Var != null) {
            sw1Var.setParentCompositionContext(null);
            sw1Var.setContent(tu1Var);
            return;
        }
        sw1 sw1Var2 = new sw1(this);
        sw1Var2.setParentCompositionContext(null);
        sw1Var2.setContent(tu1Var);
        View decorView = getWindow().getDecorView();
        if (iue.O(decorView) == null) {
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        }
        if (kue.h(decorView) == null) {
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
        }
        if (jue.I(decorView) == null) {
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
        setContentView(sw1Var2, cu1.a);
    }

    @Override // defpackage.bu1, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        o(intent);
    }

    public final void p(Bundle bundle) {
        super.onCreate(bundle);
        WeakReference weakReference = fd4.a;
        zt1 zt1Var = this.E;
        zt1Var.getClass();
        fd4.a = new WeakReference(zt1Var);
    }
}
