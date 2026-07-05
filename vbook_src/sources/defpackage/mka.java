package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.LocusId;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mka  reason: default package */
/* loaded from: classes.dex */
public final class mka {
    public final nka a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [nka, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [nu8, java.lang.Object] */
    public mka(Context context, ShortcutInfo shortcutInfo) {
        nu8[] nu8VarArr;
        String string;
        ?? obj = new Object();
        this.a = obj;
        obj.a = context;
        obj.b = shortcutInfo.getId();
        shortcutInfo.getPackage();
        Intent[] intents = shortcutInfo.getIntents();
        obj.c = (Intent[]) Arrays.copyOf(intents, intents.length);
        obj.d = shortcutInfo.getActivity();
        obj.e = shortcutInfo.getShortLabel();
        obj.f = shortcutInfo.getLongLabel();
        obj.g = shortcutInfo.getDisabledMessage();
        if (Build.VERSION.SDK_INT >= 28) {
            shortcutInfo.getDisabledReason();
        } else {
            shortcutInfo.isEnabled();
        }
        obj.j = shortcutInfo.getCategories();
        PersistableBundle extras = shortcutInfo.getExtras();
        xv6 xv6Var = null;
        if (extras != null && extras.containsKey("extraPersonCount")) {
            int i = extras.getInt("extraPersonCount");
            nu8VarArr = new nu8[i];
            int i2 = 0;
            while (i2 < i) {
                StringBuilder sb = new StringBuilder("extraPerson_");
                int i3 = i2 + 1;
                sb.append(i3);
                PersistableBundle persistableBundle = extras.getPersistableBundle(sb.toString());
                String string2 = persistableBundle.getString("name");
                String string3 = persistableBundle.getString("uri");
                String string4 = persistableBundle.getString("key");
                boolean z = persistableBundle.getBoolean("isBot");
                boolean z2 = persistableBundle.getBoolean("isImportant");
                ?? obj2 = new Object();
                obj2.a = string2;
                obj2.b = string3;
                obj2.c = string4;
                obj2.d = z;
                obj2.e = z2;
                nu8VarArr[i2] = obj2;
                i2 = i3;
            }
        } else {
            nu8VarArr = 0;
        }
        obj.i = nu8VarArr;
        shortcutInfo.getUserHandle();
        shortcutInfo.getLastChangedTimestamp();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            shortcutInfo.isCached();
        }
        shortcutInfo.isDynamic();
        shortcutInfo.isPinned();
        shortcutInfo.isDeclaredInManifest();
        shortcutInfo.isImmutable();
        shortcutInfo.isEnabled();
        shortcutInfo.hasKeyFieldsOnly();
        nka nkaVar = this.a;
        if (i4 >= 29) {
            if (shortcutInfo.getLocusId() != null) {
                LocusId locusId = shortcutInfo.getLocusId();
                jsc.w(locusId, "locusId cannot be null");
                String id = locusId.getId();
                if (!TextUtils.isEmpty(id)) {
                    xv6Var = new xv6(id);
                } else {
                    vs.m("id cannot be empty");
                    throw null;
                }
            }
        } else {
            PersistableBundle extras2 = shortcutInfo.getExtras();
            if (extras2 != null && (string = extras2.getString("extraLocusId")) != null) {
                xv6Var = new xv6(string);
            }
        }
        nkaVar.k = xv6Var;
        this.a.l = shortcutInfo.getRank();
        this.a.m = shortcutInfo.getExtras();
    }
}
