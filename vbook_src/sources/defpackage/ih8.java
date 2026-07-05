package defpackage;

import android.content.Context;
import android.content.Intent;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ih8  reason: default package */
/* loaded from: classes3.dex */
public final class ih8 {
    public final Context a;

    public ih8(Context context) {
        this.a = context;
    }

    public final void a(String str, ly lyVar) {
        lyVar.getClass();
        this.a.startActivity(new Intent().addFlags(268435456).setAction("android.intent.action.PROCESS_TEXT").putExtra("android.intent.extra.PROCESS_TEXT", str).putExtra("android.intent.extra.PROCESS_TEXT_READONLY", true).setClassName(lyVar.a, lyVar.b).setType("text/plain"));
    }
}
