DESCRIPTION = "Nike Svelte application"
# We can surely make this build from git
FILESEXTRAPATHS:prepend := "${THISDIR}:"
SRC_URI += " file://public.tar.gz"
FILES:${PN} += " ${localstatedir}/*"

LICENSE = "CLOSED"

do_install() {
  # Propagate build result into the package
  SRC=${WORKDIR}/public/*
  DST=${D}${localstatedir}/www/kratos
  install -d --mode 755 $DST
  cp -r $SRC $DST
}
