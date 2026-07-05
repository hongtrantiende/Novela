package defpackage;

import android.os.Build;
import com.vbook.android.R;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vob  reason: default package */
/* loaded from: classes.dex */
public final class vob {
    public static final vob d;
    public static final /* synthetic */ vob[] e;
    public final Object a;
    public final int b;
    public final int c;

    static {
        int i;
        vob vobVar = new vob(0, 17039363, 16843537, b23.f, "Cut");
        vob vobVar2 = new vob(1, 17039361, 16843538, b23.g, "Copy");
        vob vobVar3 = new vob(2, 17039371, 16843539, b23.h, "Paste");
        vob vobVar4 = new vob(3, 17039373, 16843646, b23.i, "SelectAll");
        Object obj = b23.j;
        if (Build.VERSION.SDK_INT <= 26) {
            i = R.string.androidx_compose_foundation_autofill;
        } else {
            i = 17039386;
        }
        vob vobVar5 = new vob(4, i, 0, obj, "Autofill");
        d = vobVar5;
        e = new vob[]{vobVar, vobVar2, vobVar3, vobVar4, vobVar5};
    }

    public vob(int i, int i2, int i3, Object obj, String str) {
        this.a = obj;
        this.b = i2;
        this.c = i3;
    }

    public static vob valueOf(String str) {
        return (vob) Enum.valueOf(vob.class, str);
    }

    public static vob[] values() {
        return (vob[]) e.clone();
    }
}
