package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vbe  reason: default package */
/* loaded from: classes.dex */
public final class vbe {
    public static final o9e a;
    public static final vbe b;

    /* JADX WARN: Type inference failed for: r0v2, types: [vbe, java.lang.Object] */
    static {
        Object[] objArr = {"firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp"};
        l6e l6eVar = f4e.C;
        for (int i = 0; i < 8; i++) {
            if (objArr[i] == null) {
                xk5.k(a82.j(i, "at index "));
                return;
            }
        }
        a = new o9e(objArr, 8);
        b = new Object();
    }

    public static void a(Context context, Status status) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putInt("statusCode", status.a);
        edit.putString("statusMessage", status.b);
        edit.putLong("timestamp", System.currentTimeMillis());
        edit.commit();
    }

    public static void b(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        o9e o9eVar = a;
        int i = o9eVar.E;
        int i2 = 0;
        while (i2 < i) {
            Object obj = o9eVar.get(i2);
            i2++;
            edit.remove((String) obj);
        }
        edit.commit();
    }
}
