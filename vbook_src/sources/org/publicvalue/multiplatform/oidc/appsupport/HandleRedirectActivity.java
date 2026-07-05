package org.publicvalue.multiplatform.oidc.appsupport;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Bundle;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class HandleRedirectActivity extends bu1 {
    public static final tn4 R = new tn4(7);
    public static final tn4 S = new tn4(8);
    public static final j35 T = new j35(0);
    public static final xu1 U = new xu1(22);
    public static final tn4 V = new tn4(9);

    @Override // defpackage.bu1, defpackage.au1, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            getIntent().removeExtra("url");
        }
    }

    @Override // defpackage.bu1, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // android.app.Activity
    public final void onResume() {
        Boolean bool;
        Boolean bool2;
        String str;
        String str2;
        Uri uri;
        IntentFilter intentFilter;
        boolean z;
        super.onResume();
        Bundle extras = getIntent().getExtras();
        String str3 = null;
        Uri uri2 = null;
        if (extras != null) {
            bool = Boolean.valueOf(extras.getBoolean("usewebview"));
        } else {
            bool = null;
        }
        Bundle extras2 = getIntent().getExtras();
        if (extras2 != null) {
            bool2 = Boolean.valueOf(extras2.getBoolean("ephemeral_session"));
        } else {
            bool2 = null;
        }
        Bundle extras3 = getIntent().getExtras();
        if (extras3 != null) {
            str = extras3.getString("url");
        } else {
            str = null;
        }
        Bundle extras4 = getIntent().getExtras();
        if (extras4 != null) {
            str2 = extras4.getString("redirecturl");
        } else {
            str2 = null;
        }
        Intent intent = getIntent();
        if (intent != null) {
            uri = intent.getData();
        } else {
            uri = null;
        }
        if (uri != null) {
            z87.B(new o54(this, (m42) null, 8));
            Intent intent2 = new Intent();
            Intent intent3 = getIntent();
            if (intent3 != null) {
                uri2 = intent3.getData();
            }
            setResult(-1, intent2.setData(uri2));
            finish();
            return;
        }
        Boolean bool3 = Boolean.TRUE;
        if (!c16.i(bool, bool3) || str != null) {
            boolean z2 = false;
            if (str == null) {
                setResult(0);
                finish();
            } else if (c16.i(getPackageName(), getApplicationContext().getPackageName())) {
                getIntent().removeExtra("url");
                Bundle extras5 = getIntent().getExtras();
                if (extras5 != null) {
                    str3 = extras5.getString("package");
                }
                getIntent().removeExtra("package");
                boolean i = c16.i(bool, bool3);
                xu1 xu1Var = U;
                if (i) {
                    if (bool2 != null) {
                        z2 = bool2.booleanValue();
                    }
                    xu1Var.h(this, str, str2, Boolean.valueOf(z2));
                    return;
                }
                le2 le2Var = new le2();
                V.invoke(le2Var);
                if (str3 != null) {
                    Iterator<ResolveInfo> it = getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 64).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ResolveInfo next = it.next();
                        ServiceInfo serviceInfo = next.serviceInfo;
                        if (serviceInfo != null && str3.equals(serviceInfo.packageName) && (intentFilter = next.filter) != null && intentFilter.hasCategory("androidx.browser.customtabs.category.EphemeralBrowsing")) {
                            if (bool2 != null) {
                                z = bool2.booleanValue();
                            } else {
                                z = false;
                            }
                            le2Var.a.putExtra("androidx.browser.customtabs.extra.ENABLE_EPHEMERAL_BROWSING", z);
                        }
                    }
                }
                kw5 a = le2Var.a();
                Intent intent4 = (Intent) a.b;
                intent4.setPackage(str3);
                try {
                    intent4.setData(Uri.parse(str));
                    startActivity(intent4, (Bundle) a.c);
                } catch (ActivityNotFoundException unused) {
                    if (bool2 != null) {
                        z2 = bool2.booleanValue();
                    }
                    xu1Var.h(this, str, str2, Boolean.valueOf(z2));
                }
            }
        }
    }
}
