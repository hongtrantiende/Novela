package defpackage;

import android.content.Context;
import java.util.UUID;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uga  reason: default package */
/* loaded from: classes.dex */
public final class uga {
    public static final pt1 b;
    public final Context a;

    static {
        ot1 b2 = pt1.b(uga.class);
        b2.a(x13.b(uc7.class));
        b2.a(x13.b(Context.class));
        b2.f = new d38(29);
        b = b2.b();
    }

    public uga(Context context) {
        this.a = context;
    }

    public final synchronized String a() {
        String string = this.a.getSharedPreferences("com.google.mlkit.internal", 0).getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        this.a.getSharedPreferences("com.google.mlkit.internal", 0).edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }
}
