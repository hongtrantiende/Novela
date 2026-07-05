package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.provider.MediaStore;
import java.util.ArrayList;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c6  reason: default package */
/* loaded from: classes.dex */
public final class c6 extends voe {
    public final int l;

    public c6(int i) {
        this.l = i;
        if (i > 1) {
            return;
        }
        vs.m("Max items must be higher than 1");
        throw null;
    }

    @Override // defpackage.voe
    /* renamed from: E */
    public final Intent k(Context context, xu8 xu8Var) {
        xu8Var.getClass();
        boolean n = qka.n();
        int i = this.l;
        if (n) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(qka.j(xu8Var.a));
            int min = Math.min(i, xu8Var.b);
            if (min > 1 && min <= MediaStore.getPickImagesMaxLimit()) {
                intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", min);
                intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", 1);
                intent.putExtra("android.provider.extra.PICK_IMAGES_IN_ORDER", false);
                return intent;
            }
            vs.m("Max items must be greater than 1 and lesser than or equal to MediaStore.getPickImagesMaxLimit()");
            return null;
        } else if (qka.i(context) != null) {
            ResolveInfo i2 = qka.i(context);
            if (i2 != null) {
                ActivityInfo activityInfo = i2.activityInfo;
                Intent intent2 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
                intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent2.setType(qka.j(xu8Var.a));
                int min2 = Math.min(i, xu8Var.b);
                if (min2 > 1) {
                    intent2.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_MAX", min2);
                    intent2.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", 1);
                    intent2.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_IN_ORDER", false);
                    return intent2;
                }
                vs.m("Max items must be greater than 1");
                return null;
            }
            vs.k("Required value was null.");
            return null;
        } else {
            Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent3.setType(qka.j(xu8Var.a));
            intent3.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            if (intent3.getType() == null) {
                intent3.setType("*/*");
                intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            }
            return intent3;
        }
    }

    @Override // defpackage.voe
    public final uwd l(Context context, Object obj) {
        ((xu8) obj).getClass();
        return null;
    }

    @Override // defpackage.voe
    public final Object o(Intent intent, int i) {
        if (i != -1) {
            intent = null;
        }
        if (intent != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Uri data = intent.getData();
            if (data != null) {
                linkedHashSet.add(data);
            }
            ClipData clipData = intent.getClipData();
            if (clipData != null || !linkedHashSet.isEmpty()) {
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i2 = 0; i2 < itemCount; i2++) {
                        Uri uri = clipData.getItemAt(i2).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                return new ArrayList(linkedHashSet);
            }
        }
        return ks3.a;
    }
}
