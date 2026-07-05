package defpackage;

import java.io.File;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jjf  reason: default package */
/* loaded from: classes.dex */
public final class jjf extends ljf {
    public int b;

    @Override // defpackage.ljf
    public final String a() {
        return "com/google/android/libraries/phenotype/client/Phlogger".replace('/', '.');
    }

    @Override // defpackage.ljf
    public final String b() {
        return "logInternal";
    }

    @Override // defpackage.ljf
    public final int c() {
        return 44;
    }

    @Override // defpackage.ljf
    public final String d() {
        return "Phlogger.java".substring("Phlogger.java".lastIndexOf(File.separatorChar) + 1);
    }

    @Override // defpackage.ljf
    public final String e() {
        return "Phlogger.java";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jjf) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        if (i == 0) {
            this.b = -1391114360;
            return -1391114360;
        }
        return i;
    }
}
