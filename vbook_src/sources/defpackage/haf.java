package defpackage;

import java.io.File;
import java.io.FileOutputStream;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: haf  reason: default package */
/* loaded from: classes.dex */
public final class haf extends naf implements w9f {
    public final FileOutputStream a;
    public final File b;

    public haf(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.a = fileOutputStream;
        this.b = file;
    }

    @Override // defpackage.w9f
    public final File zza() {
        return this.b;
    }
}
